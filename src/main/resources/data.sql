INSERT INTO CLIENTE (nombre, apellido, documento) VALUES
    ('John', 'Doe', '12345678901'),
    ('Jane', 'Smith', '98765432101'),
    ('Bob', 'Johnson', '56789012345');

INSERT INTO PRODUCTO (descripcion, codigo, stock, precio) VALUES
    ('Product A', 'A123', 100, 29.99),
    ('Product B', 'B456', 50, 49.99),
    ('Product C', 'C789', 75, 19.99);

INSERT INTO RECIBO ( creacion, total) VALUES
    ( '2024-01-20 12:00:00', 150.0),
    ( '2024-01-20 13:30:00', 99.99),
    ( '2024-01-20 14:45:00', 199.95);

INSERT INTO RECIBO_DETALLES ( monto, precio) VALUES
    ( 3,  29.99),
    ( 2,  49.99),
    ( 1,  19.99),
    ( 5,  29.99),
    ( 3,  49.99),
    ( 2,  19.99);