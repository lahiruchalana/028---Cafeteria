USE cafeteria;

CREATE TABLE product (
	id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(48) NOT NULL,
    price INT NOT NULL,
    cost INT NOT NULL,
    weight VARCHAR(48),
    PRIMARY KEY (id)
);

INSERT INTO product (name, price, cost, weight)
VALUE ("latte", 560, 230, "250ml");

SELECT * FROM product;