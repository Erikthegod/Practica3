Create table juegos(
codigo number(3) constraint jue_num_pk Primary key,
titulo varchar2(20),
categoria varchar2(20),
plataforma varchar2(20),
precio number(3)
);
insert into juegos values(1,'Fifa 16','Futbol','OUYA',30);
