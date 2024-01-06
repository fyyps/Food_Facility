

CREATE DATABASE IF NOT EXISTS `ysld_test` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `ysld_test`;

-- 表 ysld_test.food_facility_permit 结构
CREATE TABLE IF NOT EXISTS `food_facility_permit` (
  `location_id` bigint NOT NULL COMMENT 'id',
  `applicant` varchar(100) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT 'Applicant',
  `facility_type` varchar(20) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT 'FacilityType',
  `cnn` varchar(20) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT 'cnn',
  `location_description` varchar(200) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT 'LocationDescription',
  `address` varchar(100) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT 'Address',
  `block_lot` varchar(100) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT 'blocklot',
  `block` varchar(20) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT 'block',
  `lot` varchar(20) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT 'lot',
  `permit` varchar(20) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT 'permit',
  `Status` varchar(20) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT 'Status',
  `food_items` varchar(500) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT 'FoodItems',
  `X` varchar(20) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT 'X',
  `Y` varchar(20) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT 'Y',
  `latitude` varchar(50) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT 'Latitude',
  `longitude` varchar(50) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT 'Longitude',
  `schedule` varchar(500) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT 'Schedule',
  `dayshours` varchar(100) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT 'dayshours',
  `NOISent` varchar(100) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT 'NOISent',
  `approved` datetime DEFAULT NULL COMMENT 'Approved',
  `received` varchar(20) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT 'Received',
  `priorPermit` tinyint NOT NULL DEFAULT '0' COMMENT 'PriorPermit',
  `expiration_date` datetime DEFAULT NULL COMMENT 'ExpirationDate',
  `location` varchar(100) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT 'Location',
  `fire_prevention_districts` int NOT NULL DEFAULT '0' COMMENT 'Fire Prevention Districts',
  `police_districts` int NOT NULL DEFAULT '0' COMMENT 'Police Districts',
  `supervisor_districts` int NOT NULL DEFAULT '0' COMMENT 'Supervisor Districts',
  `zip_codes` varchar(20) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT 'Zip Codes',
  `neighborhoods` int NOT NULL DEFAULT '0' COMMENT 'Neighborhoods (old)',
  PRIMARY KEY (`location_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='Mobile Food Facility Permit';






















