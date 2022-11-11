USE cafeteria;

CREATE TABLE stock (
	id INT NOT NULL AUTO_INCREMENT,
    product_id INT NOT NULL,
    available_stock INT,
    backlog INT,
    measure VARCHAR(24),
    PRIMARY KEY (id)
);

SELECT * FROM stock;

ALTER TABLE stock
ADD CONSTRAINT fk_product
FOREIGN KEY (product_id) REFERENCES product(id);

