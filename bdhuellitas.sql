create table cita (
	idcita int primary key auto_increment,
	idmascota int not null,
	fecha date not null,
	estado varchar(20)
);

create table visita (
	idvisita int primary key auto_increment,
	idcita int not null,
	fecha date not null,
	notas text,
	foreign key (idcita) references cita(idcita)
);
