drop table if exists ACCIDENT;

drop table if exists ATTESTATION_DEPENSES;

drop table if exists AVEC;

drop table if exists CATEGORIE_ACCIDENT;

drop table if exists COMPAGNIE_ASSURANCE;

drop table if exists COURIER;

drop table if exists ENFANT;

drop table if exists ETAT_PERSON;

drop table if exists FICHE_DE_PAIE;

drop table if exists GARANT;

drop table if exists GRADE_MILITAIRE;

drop table if exists MARQUE;

drop table if exists MODELE;

drop table if exists PERSON;

drop table if exists P_CONTRAT_V;

drop table if exists P_FAIRE_A;

drop table if exists REGION_MILITAIRE;

drop table if exists ROLE_PERSON;

drop table if exists SITUATION_FAMILIALLE;

drop table if exists SITUATION_PERSON;

drop table if exists TYPE_VEHICULE;

drop table if exists UNITE_MILITAIRE;

drop table if exists VEHICULE;

drop table if exists WILAYA;

/*==============================================================*/
/* Table: ACCIDENT                                              */
/*==============================================================*/
create table ACCIDENT
(
   NUMERO_ACC           smallint not null AUTO_INCREMENT,
   NUMERO_WILAYA        int not null,
   CODE_GBGNE              bigint not null,
   CODE_CAT             int not null,
   DATE_ACCEDENT        date,
   NUMERO_PV            bigint not null,
   DATE_PV              date,
   DESCRIPTION          varchar(500),
   NDRM                 varchar(50),
   NAJT                 varchar(50),
   ACCIDENT_DEFINIT     bool,
   ACCIDENT_FORMULE     bool,
   primary key (NUMERO_ACC)
);

/*==============================================================*/
/* Table: ATTESTATION_DEPENSES                                  */
/*==============================================================*/
create table ATTESTATION_DEPENSES
(
   CODE_AD              bigint not null AUTO_INCREMENT,
   LE_SMIG              double,
   DUREE_CONVALESCANCE  int,
   POURCENTAGE_INV      real,
   CR                   real,
   CM                   varchar(30),
   primary key (CODE_AD)
);

/*==============================================================*/
/* Table: AVEC                                                  */
/*==============================================================*/
create table AVEC
(
   NUMERO_ACC           smallint not null,
   CODE_P               bigint not null,
   CODE_ETAT            int not null,
   CODE_R               int not null,
   CODE_SF              int not null,
   MATRICULE_V          bigint not null,
   C_FAUTIF             bool,
   CODE_GRT				int,
   primary key (NUMERO_ACC, CODE_P, CODE_ETAT, CODE_R, CODE_SF, MATRICULE_V)
);

/*==============================================================*/
/* Table: CATEGORIE_ACCIDENT                                    */
/*==============================================================*/
create table CATEGORIE_ACCIDENT
(
   CODE_CAT             int not null AUTO_INCREMENT,
   LIBELLE_CAT          varchar(250),
   primary key (CODE_CAT)
);

/*==============================================================*/
/* Table: COMPAGNIE_ASSURANCE                                   */
/*==============================================================*/
create table COMPAGNIE_ASSURANCE
(
   NUMERO_CA            bigint not null AUTO_INCREMENT,
   LIBELLE_COMPA        varchar(250),
   ADRESSE_COMP         varchar(250),
   primary key (NUMERO_CA)
);

/*==============================================================*/
/* Table: COURIER                                               */
/*==============================================================*/
create table COURIER
(
   CODE_C               bigint not null AUTO_INCREMENT,
   NUMERO_ACC           smallint not null,
   DATA_C               date,
   EMETTEUR             varchar(250),
   RECEPTEUR            varchar(250),
   SUJET                varchar(500),
   primary key (CODE_C)
);

/*==============================================================*/
/* Table: ENFANT                                                */
/*==============================================================*/
create table ENFANT
(
   CODE_ENFANT          int not null AUTO_INCREMENT,
   CODE_P               bigint not null,
   NOM                  varchar(250),
   DATE_NAISSANCE       date,
   SEXE                 varchar(30),
   primary key (CODE_ENFANT)
);

/*==============================================================*/
/* Table: ETAT_PERSON                                           */
/*==============================================================*/
create table ETAT_PERSON
(
   CODE_ETAT            int not null AUTO_INCREMENT,
   LIBELLE_ETAT         varchar(250),
   primary key (CODE_ETAT)
);

/*==============================================================*/
/* Table: FICHE_DE_PAIE                                         */
/*==============================================================*/
create table FICHE_DE_PAIE
(
   CODE_FP              bigint not null AUTO_INCREMENT,
   PAIE                 double,
   PENSION_RETRAITE     double,
   ASSURANCE_S          varchar(250),
   CREDIT_SOCIAL        double,
   ISLRG                double,
   CL                   double,
   CLT                  double,
   EPLF                 double,
   PI                   double,
   RD                   double,
   primary key (CODE_FP)
);

/*==============================================================*/
/* Table: GARANT                                                */
/*==============================================================*/
create table GARANT
(
   CODE_GRT             int AUTO_INCREMENT,
   NOM_GARANT           varchar(250),
   PRENOM_GARANT        varchar(250),
   primary key (CODE_GRT)
);

/*==============================================================*/
/* Table: GRADE_MILITAIRE                                       */
/*==============================================================*/
create table GRADE_MILITAIRE
(
   CODE_GM              int not null AUTO_INCREMENT,
   LIBELLE_GM           varchar(50),
   primary key (CODE_GM)
);

/*==============================================================*/
/* Table: MARQUE                                                */
/*==============================================================*/
create table MARQUE
(
   CODE_MARQUE          bigint not null AUTO_INCREMENT,
   LIBELLE_MARQUE       varchar(250),
   primary key (CODE_MARQUE)
);

/*==============================================================*/
/* Table: MODELE                                                */
/*==============================================================*/
create table MODELE
(
   CODE_M               bigint not null AUTO_INCREMENT,
   CODE_MARQUE          bigint not null,
   LIBELLE_MODELE       varchar(250),
   primary key (CODE_M)
);

/*==============================================================*/
/* Table: PERSON                                                */
/*==============================================================*/
create table PERSON
(
   CODE_P               bigint not null AUTO_INCREMENT,
   NOM                  varchar(250),
   PRENOM               varchar(250),
   DATE_DE_NAISSANCE    varchar(250),
   CCP                  bigint,
   NOM_PERE             varchar(250),
   NOM_MERE             varchar(250),
   PRENOM_MERE          varchar(250),
   PRENOM_CONJOINT      varchar(250),
   NOM_CONJOINT         varchar(250),
   DATE_NAISSANCE_PERE  date,
   DATE_NAISSANCE_MERE  date,
   DATE_NAISSANCE_MARIE date,
   DATE_NAISSANCE_GARANT date,
   SEXE                 varchar(30),
   MATRICULE_P          bigint,
   primary key (CODE_P)
);

/*==============================================================*/
/* Table: P_CONTRAT_V                                           */
/*==============================================================*/
create table P_CONTRAT_V
(
   NUMERO_CONTRAT       bigint not null,
   NUMERO_CA            bigint not null,
   MATRICULE_V          bigint not null,
   DATE_CONTRAT         date,
   primary key (NUMERO_CONTRAT)
);

/*==============================================================*/
/* Table: P_FAIRE_A                                             */
/*==============================================================*/
create table P_FAIRE_A
(
   NUMERO_ACC           smallint not null,
   CODE_P               bigint not null,
   CODE_ETAT            int not null,
   CODE_SP              int not null,
   CODE_R               int not null,
   CODE_SF              int not null,
   MATRICULE_V          bigint not null,
   CODE_GM              int not null,
   CODE_FP              bigint not null,
   CODE_AD              bigint not null,
   CODE_UM              bigint not null,
   M_FAUTIF             bool,
   NB_ENFT              int,
   primary key (NUMERO_ACC, CODE_P, CODE_ETAT, CODE_SP, CODE_R, CODE_SF, MATRICULE_V, CODE_GM, CODE_FP, CODE_AD, CODE_UM)
);

/*==============================================================*/
/* Table: REGION_MILITAIRE                                      */
/*==============================================================*/
create table REGION_MILITAIRE
(
   NUMERO_RM            int not null AUTO_INCREMENT,
   LIBELLE_RM           varchar(250),
   primary key (NUMERO_RM)
);

/*==============================================================*/
/* Table: ROLE_PERSON                                           */
/*==============================================================*/
create table ROLE_PERSON
(
   CODE_R               int not null AUTO_INCREMENT,
   LIBELLE_ROLE         varchar(250),
   primary key (CODE_R)
);

/*==============================================================*/
/* Table: SITUATION_FAMILIALLE                                  */
/*==============================================================*/
create table SITUATION_FAMILIALLE
(
   CODE_SF              int not null AUTO_INCREMENT,
   LIBELLE_SF           varchar(250),
   primary key (CODE_SF)
);

/*==============================================================*/
/* Table: SITUATION_PERSON                                      */
/*==============================================================*/
create table SITUATION_PERSON
(
   CODE_SP              int not null AUTO_INCREMENT,
   LIBELLE_SP           varchar(250),
   primary key (CODE_SP)
);

/*==============================================================*/
/* Table: TYPE_VEHICULE                                         */
/*==============================================================*/
create table TYPE_VEHICULE
(
   CODE_TV              int not null AUTO_INCREMENT,
   LIBELLE_T            varchar(250),
   primary key (CODE_TV)
);

/*==============================================================*/
/* Table: UNITE_MILITAIRE                                       */
/*==============================================================*/
create table UNITE_MILITAIRE
(
   CODE_UM              bigint not null AUTO_INCREMENT,
   NUMERO_WILAYA        int not null,
   UNI_CODE_UM          bigint,
   LIBELLE_UM           varchar(250),
   primary key (CODE_UM)
);

/*==============================================================*/
/* Table: VEHICULE                                              */
/*==============================================================*/
create table VEHICULE
(
   MATRICULE_V          bigint not null,
   CODE_M               bigint not null,
   CODE_TV              int not null,
   primary key (MATRICULE_V)
);

/*==============================================================*/
/* Table: WILAYA                                                */
/*==============================================================*/
create table WILAYA
(
   NUMERO_WILAYA        int not null AUTO_INCREMENT,
   NUMERO_RM            int not null,
   CODE_GGN              bigint ,
   LIBELLE_WILAYA       varchar(250),
   NOM_WILAYA           varchar(250),
   primary key (NUMERO_WILAYA)
);

alter table ACCIDENT add constraint FK_A_AVOIR_C foreign key (CODE_CAT)
      references CATEGORIE_ACCIDENT (CODE_CAT) on delete restrict on update restrict;

alter table ACCIDENT add constraint FK_A_EU_LIEU foreign key (NUMERO_WILAYA)
      references WILAYA (NUMERO_WILAYA) on delete restrict on update restrict;

alter table ACCIDENT add constraint FK_ENQUETER_PAR foreign key (CODE_GBGNE)
      references UNITE_MILITAIRE (CODE_UM) on delete restrict on update restrict;

alter table AVEC add constraint FK_AVEC foreign key (MATRICULE_V)
      references VEHICULE (MATRICULE_V) on delete restrict on update restrict;

alter table AVEC add constraint FK_AVEC2 foreign key (NUMERO_ACC)
      references ACCIDENT (NUMERO_ACC) on delete restrict on update restrict;

alter table AVEC add constraint FK_AVEC3 foreign key (CODE_P)
      references PERSON (CODE_P) on delete restrict on update restrict;

alter table AVEC add constraint FK_AVEC4 foreign key (CODE_ETAT)
      references ETAT_PERSON (CODE_ETAT) on delete restrict on update restrict;

alter table AVEC add constraint FK_AVEC5 foreign key (CODE_R)
      references ROLE_PERSON (CODE_R) on delete restrict on update restrict;

alter table AVEC add constraint FK_AVEC6 foreign key (CODE_SF)
      references SITUATION_FAMILIALLE (CODE_SF) on delete restrict on update restrict;

alter table AVEC add constraint FK_AVEC7 foreign key (CODE_GRT)
      references GARANT (CODE_GRT) on delete restrict on update restrict;

alter table COURIER add constraint FK_A_AVOIR_CO foreign key (NUMERO_ACC)
      references ACCIDENT (NUMERO_ACC) on delete restrict on update restrict;

alter table ENFANT add constraint FK_E_FILS_DE_P foreign key (CODE_P)
      references PERSON (CODE_P) on delete restrict on update restrict;

alter table MODELE add constraint FK_M_APPARTIENT_M foreign key (CODE_MARQUE)
      references MARQUE (CODE_MARQUE) on delete restrict on update restrict;

alter table P_CONTRAT_V add constraint FK_COUVRE foreign key (MATRICULE_V)
      references VEHICULE (MATRICULE_V) on delete restrict on update restrict;

alter table P_CONTRAT_V add constraint FK_ETABLIT foreign key (NUMERO_CA)
      references COMPAGNIE_ASSURANCE (NUMERO_CA) on delete restrict on update restrict;

alter table P_FAIRE_A add constraint FK_P_FAIRE_A foreign key (CODE_UM)
      references UNITE_MILITAIRE (CODE_UM) on delete restrict on update restrict;

alter table P_FAIRE_A add constraint FK_P_FAIRE_A10 foreign key (CODE_FP)
      references FICHE_DE_PAIE (CODE_FP) on delete restrict on update restrict;

alter table P_FAIRE_A add constraint FK_P_FAIRE_A11 foreign key (CODE_AD)
      references ATTESTATION_DEPENSES (CODE_AD) on delete restrict on update restrict;

alter table P_FAIRE_A add constraint FK_P_FAIRE_A2 foreign key (NUMERO_ACC)
      references ACCIDENT (NUMERO_ACC) on delete restrict on update restrict;

alter table P_FAIRE_A add constraint FK_P_FAIRE_A3 foreign key (CODE_P)
      references PERSON (CODE_P) on delete restrict on update restrict;

alter table P_FAIRE_A add constraint FK_P_FAIRE_A4 foreign key (CODE_ETAT)
      references ETAT_PERSON (CODE_ETAT) on delete restrict on update restrict;

alter table P_FAIRE_A add constraint FK_P_FAIRE_A5 foreign key (CODE_SP)
      references SITUATION_PERSON (CODE_SP) on delete restrict on update restrict;

alter table P_FAIRE_A add constraint FK_P_FAIRE_A6 foreign key (CODE_R)
      references ROLE_PERSON (CODE_R) on delete restrict on update restrict;

alter table P_FAIRE_A add constraint FK_P_FAIRE_A7 foreign key (CODE_SF)
      references SITUATION_FAMILIALLE (CODE_SF) on delete restrict on update restrict;

alter table P_FAIRE_A add constraint FK_P_FAIRE_A8 foreign key (MATRICULE_V)
      references VEHICULE (MATRICULE_V) on delete restrict on update restrict;

alter table P_FAIRE_A add constraint FK_P_FAIRE_A9 foreign key (CODE_GM)
      references GRADE_MILITAIRE (CODE_GM) on delete restrict on update restrict;

alter table UNITE_MILITAIRE add constraint FK_BGN_APPARTIENT_GGN foreign key (UNI_CODE_UM)
      references UNITE_MILITAIRE (CODE_UM) on delete restrict on update restrict;


alter table UNITE_MILITAIRE add constraint FK_U_APPARTIENT_W foreign key (NUMERO_WILAYA)
      references WILAYA (NUMERO_WILAYA) on delete restrict on update restrict;

alter table VEHICULE add constraint FK_V_APPARTIENT_M foreign key (CODE_M)
      references MODELE (CODE_M) on delete restrict on update restrict;

alter table VEHICULE add constraint FK_V_EST_T foreign key (CODE_TV)
      references TYPE_VEHICULE (CODE_TV) on delete restrict on update restrict;

alter table WILAYA add constraint FK_RM_CONTIENT_W foreign key (NUMERO_RM)
      references REGION_MILITAIRE (NUMERO_RM) on delete restrict on update restrict;

alter table WILAYA add constraint FK_U_GROUPEMT_GNW foreign key (CODE_GGN)
      references UNITE_MILITAIRE (CODE_UM) on delete restrict on update restrict;
