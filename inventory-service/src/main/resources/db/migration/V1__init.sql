-- File: V1__init.sql

-- Drop table if exists (for safety during development; optional)
DROP TABLE IF EXISTS t_inventory;

-- Create table t_inventory
CREATE TABLE t_inventory (
                             id BIGINT PRIMARY KEY AUTO_INCREMENT,
                             sku_code VARCHAR(255),
                             quantity INTEGER
);

-- Optional: Add any additional constraints or indexes here

-- Optional: Insert initial data if needed
-- INSERT INTO t_inventory (sku_code, quantity) VALUES ('SKU001', 100);
