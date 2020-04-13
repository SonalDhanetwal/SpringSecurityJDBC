INSERT INTO users(username, password, enabled)
values('Sonal','Sonal',true);

INSERT INTO users(username, password, enabled)
values('Admin','Admin',true);

INSERT INTO authorities(username, authority)
values('Sonal','ROLE_USER');

INSERT INTO authorities(username, authority)
values('Admin','ROLE_ADMIN');
