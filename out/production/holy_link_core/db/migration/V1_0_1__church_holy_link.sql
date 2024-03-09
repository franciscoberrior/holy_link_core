

    create table ATTENDANCE (
       id  bigserial not null,
        created_by varchar(255),
        created_date timestamp,
        deleted boolean,
        state boolean,
        updated_by varchar(255),
        updated_date timestamp,
        person_id int8,
        planing_id int8,
        primary key (id)
    );

    create table CHURCH (
       id  bigserial not null,
        deleted boolean,
        description varchar(255),
        name varchar(255),
        primary key (id)
    );

    create table COST_CENTER (
       id  bigserial not null,
        created_by varchar(255),
        created_date timestamp,
        deleted boolean,
        description varchar(255),
        name varchar(255),
        updated_by varchar(255),
        updated_date timestamp,
        responsible_id int8,
        primary key (id)
    );

    create table COURSE (
       id  bigserial not null,
        created_by varchar(255),
        created_date timestamp,
        deleted boolean,
        description varchar(255),
        name varchar(255),
        updated_by varchar(255),
        updated_date timestamp,
        responsible_id int8,
        primary key (id)
    );

    create table COURSE_TYPE (
       id  bigserial not null,
        created_by varchar(255),
        created_date timestamp,
        deleted boolean,
        description varchar(255),
        name varchar(255),
        updated_by varchar(255),
        updated_date timestamp,
        primary key (id)
    );

    create table EVENTS (
       id  bigserial not null,
        created_by varchar(255),
        created_date timestamp,
        deleted boolean,
        description varchar(255),
        name varchar(255),
        updated_by varchar(255),
        updated_date timestamp,
        primary key (id)
    );

    create table EXPENSES (
       id  bigserial not null,
        amount numeric(19, 2),
        created_by varchar(255),
        created_date timestamp,
        deleted boolean,
        description varchar(255),
        updated_by varchar(255),
        updated_date timestamp,
        person_id int8,
        expenses_type_id int8,
        primary key (id)
    );

    create table EXPENSES_COST_CENTER (
       id  bigserial not null,
        created_by varchar(255),
        created_date timestamp,
        deleted boolean,
        description varchar(255),
        updated_by varchar(255),
        updated_date timestamp,
        cost_center_id int8,
        expenses_id int8,
        primary key (id)
    );

    create table EXPENSES_TYPE (
       id  bigserial not null,
        created_by varchar(255),
        created_date timestamp,
        deleted boolean,
        description varchar(255),
        name varchar(255),
        updated_by varchar(255),
        updated_date timestamp,
        primary key (id)
    );

    create table GROUPS (
       id  bigserial not null,
        created_by varchar(255),
        created_date timestamp,
        deleted boolean,
        description varchar(255),
        name varchar(255),
        updated_by varchar(255),
        updated_date timestamp,
        primary key (id)
    );

    create table INCOME (
       id  bigserial not null,
        amount numeric(19, 2),
        created_by varchar(255),
        created_date timestamp,
        deleted boolean,
        description varchar(255),
        updated_by varchar(255),
        updated_date timestamp,
        person_id int8,
        income_type_id int8,
        primary key (id)
    );

    create table INCOME_COST_CENTER (
       id  bigserial not null,
        created_by varchar(255),
        created_date timestamp,
        deleted boolean,
        description varchar(255),
        updated_by varchar(255),
        updated_date timestamp,
        cost_center_id int8,
        income_id int8,
        primary key (id)
    );

    create table INCOME_TYPE (
       id  bigserial not null,
        created_by varchar(255),
        created_date timestamp,
        deleted boolean,
        description varchar(255),
        name varchar(255),
        updated_by varchar(255),
        updated_date timestamp,
        primary key (id)
    );

    create table MINISTRIES (
       id  bigserial not null,
        created_by varchar(255),
        created_date timestamp,
        deleted boolean,
        description varchar(255),
        name varchar(255),
        updated_by varchar(255),
        updated_date timestamp,
        group_id int8,
        leader_id int8,
        primary key (id)
    );

    create table PERSON (
       id  bigserial not null,
        birthday date,
        cellphone varchar(255),
        created_by varchar(255),
        created_date timestamp,
        deleted boolean,
        email varchar(255),
        facebook varchar(255),
        firstName varchar(255),
        innitYear date,
        instagram varchar(255),
        lastName varchar(255),
        numberId varchar(255),
        secondLastName varchar(255),
        secondName varchar(255),
        typeNumberId varchar(255),
        updated_by varchar(255),
        updated_date timestamp,
        youtube varchar(255),
        primary key (id)
    );

    create table PERSON_COURSE (
       id  bigserial not null,
        created_by varchar(255),
        created_date timestamp,
        deleted boolean,
        updated_by varchar(255),
        updated_date timestamp,
        student_id int8,
        primary key (id)
    );

    create table PERSON_GROUPS (
       id  bigserial not null,
        created_by varchar(255),
        created_date timestamp,
        deleted boolean,
        updated_by varchar(255),
        updated_date timestamp,
        group_id int8,
        person_id int8,
        primary key (id)
    );

    create table PLANNING (
       id  bigserial not null,
        created_by varchar(255),
        created_date timestamp,
        deleted boolean,
        endDate timestamp,
        initDate timestamp,
        status boolean,
        updated_by varchar(255),
        updated_date timestamp,
        event_id int8,
        responsible_id int8,
        primary key (id)
    );

    create table PRODUCT (
       id  bigserial not null,
        amount int4,
        deleted boolean,
        description varchar(255),
        name varchar(255),
        primary key (id)
    );

    alter table ATTENDANCE
       add constraint FK3w2tljjb9r9q2ewqynp5caypm
       foreign key (person_id)
       references PERSON;

    alter table ATTENDANCE
       add constraint FKdgnv0swr084m78wb6278t0x2w
       foreign key (planing_id)
       references PLANNING;

    alter table COST_CENTER
       add constraint FK1oe5cesvr1im1fq80eus7ytvh
       foreign key (responsible_id)
       references PERSON;

    alter table COURSE
       add constraint FKe9qhtjpncqb8kcx6or0hv4es4
       foreign key (responsible_id)
       references PERSON;

    alter table EXPENSES
       add constraint FK1j65unk6pgw6boxiot3387ior
       foreign key (person_id)
       references PERSON;

    alter table EXPENSES
       add constraint FK44ttgfadieykbnk9ggo97hbqg
       foreign key (expenses_type_id)
       references EXPENSES_TYPE;

    alter table EXPENSES_COST_CENTER
       add constraint FKai7infud5wsfnabwws7ysd28h
       foreign key (cost_center_id)
       references COST_CENTER;

    alter table EXPENSES_COST_CENTER
       add constraint FKea9ikd7p2g7eoe516yd48s4qy
       foreign key (expenses_id)
       references EXPENSES;

    alter table INCOME
       add constraint FKqctrcxyjmxilucuibpyc2hrjq
       foreign key (person_id)
       references PERSON;

    alter table INCOME
       add constraint FKiuqwujfabxud5j4aeevf7igqr
       foreign key (income_type_id)
       references INCOME_TYPE;

    alter table INCOME_COST_CENTER
       add constraint FK3incw1fnk9tknbdp8vj5ql2jt
       foreign key (cost_center_id)
       references COST_CENTER;

    alter table INCOME_COST_CENTER
       add constraint FKpjsbpheabxhg96po172stef5c
       foreign key (income_id)
       references INCOME;

    alter table MINISTRIES
       add constraint FKskr0igibgc5biicnfwg3d8xeo
       foreign key (group_id)
       references GROUPS;

    alter table MINISTRIES
       add constraint FKmc64w19j8o6vjpwmfif6wxs89
       foreign key (leader_id)
       references PERSON;

    alter table PERSON_COURSE
       add constraint FKkrjd5hsosby52ss43r2lbo32w
       foreign key (student_id)
       references PERSON;

    alter table PERSON_GROUPS
       add constraint FKqbibxg9fjkub1nyl0n6jvjl9p
       foreign key (group_id)
       references GROUPS;

    alter table PERSON_GROUPS
       add constraint FKgsy56xosrycmj80yyg0j3ear4
       foreign key (person_id)
       references PERSON;

    alter table PLANNING
       add constraint FK9twbkwh4qrim3so53h28wetkj
       foreign key (event_id)
       references EVENTS;

    alter table PLANNING
       add constraint FK524m02c3fgn1xqbdsvuv4ubjt
       foreign key (responsible_id)
       references PERSON;

COMMENT ON COLUMN CHURCH.id IS 'Campo numérico auto-incrementable. ID de la iglesia.';
COMMENT ON COLUMN CHURCH.name IS 'Campo de texto. Nombre de la iglesia.';
COMMENT ON COLUMN CHURCH.description IS 'Campo de texto. Descripción de la iglesia.';
COMMENT ON COLUMN CHURCH.deleted IS 'Campo booleano. indica si el registro fue eliminado.';

COMMENT ON COLUMN CHURCH.id IS 'Campo numérico auto-incrementable. ID de la iglesia.';
COMMENT ON COLUMN CHURCH.name IS 'Campo de texto. Nombre de la iglesia.';
COMMENT ON COLUMN CHURCH.description IS 'Campo de texto. Descripción de la iglesia.';
COMMENT ON COLUMN CHURCH.deleted IS 'Campo booleano. indica si el registro fue eliminado.';