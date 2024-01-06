package com.el.util;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @Desc:
 * @Author: derek
 * @Date: 2022/7/29
 */
@Slf4j
public class BeanVoDtoUtils<V, E> {

    /**
     * TODO  dot ,Do ,entity 相互转换
     * 同：BeanUtils.copyProperties(dtoEntity, newInstance);
     *
     * @param oldClass 原数据--Dto，Vo，entity
     * @param newClass 转换为--Dto，Vo，entity
     * @return
     */
    public static <E> E convert(Object oldClass, Class<E> newClass) {
        // 判断oldClass 是否为空!
        if (oldClass == null) {
            return null;
        }
        // 判断newClass 是否为空
        if (newClass == null) {
            return null;
        }
        try {
            // 创建新的对象实例
            E newInstance = newClass.newInstance();
            // 把原对象数据拷贝到新的对象
            BeanUtils.copyProperties(oldClass, newInstance);
            // 返回新对象
            return newInstance;
        } catch (Exception e) {
            log.error("转换失败", e);
            return null;
        }
    }


    //TODO  list<Entity> 集合对象转list<Vo> ( list 循环)
    public static <T, V> List<V> listVo(List<T> oldList, Class<V> v) {
        try {
            List<V> voList = new ArrayList<>();
            for (T t : oldList) {
                V newv = (V) convert(t, v.newInstance().getClass());
                voList.add(newv);
            }
            return voList;
        } catch (Exception e) {
            log.error("转换失败", e);
        }
        return null;
    }


    //TODO  list<Entity> 集合对象转list<Vo> （Stream 方式）
    public static <T, V> List<V> listVoStream(List<T> oldList, Class<V> v) {
        List<V> voList = oldList.stream().map(item -> {
            try {
                return (V) convert(item, v.newInstance().getClass());
            } catch (Exception e) {
                log.error("转换失败", e);
            }
            return null;
        }).collect(Collectors.toList());
        return voList;
    }
    
    public static void copyMapToObject(Map<String, String> map, Object o) {
        Set<String> set = map.keySet();
        Class c = o.getClass();
        Field[] fields = c.getDeclaredFields();
        for (Field f : fields) {
            f.setAccessible(true);
            if (set.contains(f.getName())){
                try {
                	String value = map.get(f.getName());
                	Object targetValue = null;
                    if(StringUtils.isNotBlank(value)) {
                		if(f.getType() == Integer.class) {
                			targetValue = Integer.parseInt(value);
                		}else if(f.getType() == Long.class) {
                			targetValue = Long.parseLong(value);
                		}else {
                			targetValue = value;
                		}
                	}
                    f.set(o, targetValue);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
