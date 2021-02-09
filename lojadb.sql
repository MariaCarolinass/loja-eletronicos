-- ---
-- Globals
-- ---

-- SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
-- SET FOREIGN_KEY_CHECKS=0;

-- ---
-- Table 'cliente'
-- 
-- ---

DROP TABLE IF EXISTS `cliente`;
		
CREATE TABLE `cliente` (
  `id` INTEGER NULL AUTO_INCREMENT DEFAULT NULL,
  `nome` VARCHAR(500) NULL DEFAULT NULL,
  `rua` VARCHAR(500) NULL DEFAULT NULL,
  `bairro` VARCHAR(500) NULL DEFAULT NULL,
  `numero` INTEGER(500) NULL DEFAULT NULL,
  `telefone` INTEGER(500) NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
);

-- ---
-- Table 'eletronico'
-- 
-- ---

DROP TABLE IF EXISTS `eletronico`;
		
CREATE TABLE `eletronico` (
  `id` INTEGER NULL AUTO_INCREMENT DEFAULT NULL,
  `preco` INTEGER(500) NULL DEFAULT NULL,
  `tipo` VARCHAR(500) NULL DEFAULT NULL,
  `garantia` INTEGER(500) NULL DEFAULT NULL,
  `marca` VARCHAR(500) NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
);

-- ---
-- Foreign Keys 
-- ---


-- ---
-- Table Properties
-- ---

-- ALTER TABLE `cliente` ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
-- ALTER TABLE `eletronico` ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ---
-- Test Data
-- ---

-- INSERT INTO `cliente` (`id`,`nome`,`rua`,`bairro`,`numero`,`telefone`) VALUES
-- ('','','','','','');
-- INSERT INTO `eletronico` (`id`,`preco`,`tipo`,`garantia`,`marca`) VALUES
-- ('','','','','');
