drop table if exists ROLE;

drop table if exists UTILISATEUR;

/*==============================================================*/
/* Table: ROLE                                                  */
/*==============================================================*/
create table ROLE
(
   CODE_ROLE            int not null,
   LIBELLE_ROLE         varchar(250),
   primary key (CODE_ROLE)
);

/*==============================================================*/
/* Table: UTILISATEUR                                                 */
/*==============================================================*/
create table UTILISATEUR
(
   CODE_ROLE            int not null,
   MATRECULE_UTILISATEUR varchar(250),
   NOM_UTILISATEUR      varchar(250) not null,
   PRENOM_UTILISATEUR   varchar(250),
   MOT_DE_PASS          varchar(250),
   primary key (NOM_UTILISATEUR)
);

alter table UTILISATEUR add constraint FK_U_AVOIR_R foreign key (CODE_ROLE)
      references ROLE (CODE_ROLE) on delete restrict on update restrict;