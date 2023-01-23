/*==============================================================*/
/* Table: CATEGORIE_ACCIDENT                                    */
/*==============================================================*/
INSERT INTO `categorie_accident` (`CODE_CAT`, `LIBELLE_CAT`) VALUES (NULL, 'جسماني');
INSERT INTO `categorie_accident` (`CODE_CAT`, `LIBELLE_CAT`) VALUES (NULL, 'مادي');
INSERT INTO `categorie_accident` (`CODE_CAT`, `LIBELLE_CAT`) VALUES (NULL, 'جسماني و مادي');
INSERT INTO `categorie_accident` (`CODE_CAT`, `LIBELLE_CAT`) VALUES (NULL, 'مميتة');


/*==============================================================*/
/* Table: ETAT_PERSON                                           */
/*==============================================================*/
INSERT INTO `etat_person` (`CODE_ETAT`, `LIBELLE_ETAT`) VALUES (NULL, 'متوفي');
INSERT INTO `etat_person` (`CODE_ETAT`, `LIBELLE_ETAT`) VALUES (NULL, 'جريح');
INSERT INTO `etat_person` (`CODE_ETAT`, `LIBELLE_ETAT`) VALUES (NULL, 'لا شئ');


/*==============================================================*/
/* Table: GRADE_MILITAIRE                                       */
/*==============================================================*/
INSERT INTO `grade_militaire` (`CODE_GM`, `LIBELLE_GM`) VALUES (NULL, 'جندي');
INSERT INTO `grade_militaire` (`CODE_GM`, `LIBELLE_GM`) VALUES (NULL, 'عريف');
INSERT INTO `grade_militaire` (`CODE_GM`, `LIBELLE_GM`) VALUES (NULL, 'عريف اول');
INSERT INTO `grade_militaire` (`CODE_GM`, `LIBELLE_GM`) VALUES (NULL, 'رقيب');
INSERT INTO `grade_militaire` (`CODE_GM`, `LIBELLE_GM`) VALUES (NULL, 'رقيب اول');
INSERT INTO `grade_militaire` (`CODE_GM`, `LIBELLE_GM`) VALUES (NULL, 'مساعد');
INSERT INTO `grade_militaire` (`CODE_GM`, `LIBELLE_GM`) VALUES (NULL, 'مساعد اول اساسي');
INSERT INTO `grade_militaire` (`CODE_GM`, `LIBELLE_GM`) VALUES (NULL, 'ملازم');
INSERT INTO `grade_militaire` (`CODE_GM`, `LIBELLE_GM`) VALUES (NULL, 'ملازم اول');
INSERT INTO `grade_militaire` (`CODE_GM`, `LIBELLE_GM`) VALUES (NULL, 'نقيب');
INSERT INTO `grade_militaire` (`CODE_GM`, `LIBELLE_GM`) VALUES (NULL, 'رائد');
INSERT INTO `grade_militaire` (`CODE_GM`, `LIBELLE_GM`) VALUES (NULL, 'مقدم');
INSERT INTO `grade_militaire` (`CODE_GM`, `LIBELLE_GM`) VALUES (NULL, 'عقيد');
INSERT INTO `grade_militaire` (`CODE_GM`, `LIBELLE_GM`) VALUES (NULL, 'عميد');
INSERT INTO `grade_militaire` (`CODE_GM`, `LIBELLE_GM`) VALUES (NULL, 'لواء');
INSERT INTO `grade_militaire` (`CODE_GM`, `LIBELLE_GM`) VALUES (NULL, 'فريق');
INSERT INTO `grade_militaire` (`CODE_GM`, `LIBELLE_GM`) VALUES (NULL, 'فريق اول');


/*==============================================================*/
/* Table: REGION_MILITAIRE                                      */
/*==============================================================*/
INSERT INTO `region_militaire` (`NUMERO_RM`, `LIBELLE_RM`) VALUES (NULL, 'الناحية العسكرية الاولى -قسنطينة-');
INSERT INTO `region_militaire` (`NUMERO_RM`, `LIBELLE_RM`) VALUES (NULL, 'الناحية العسكرية الثانية-وهران-');
INSERT INTO `region_militaire` (`NUMERO_RM`, `LIBELLE_RM`) VALUES (NULL, 'الناحية العسكرية الثالثة-بشار-');
INSERT INTO `region_militaire` (`NUMERO_RM`, `LIBELLE_RM`) VALUES (NULL, 'الناحية العسكرية الرابعة-ورقلة-');
INSERT INTO `region_militaire` (`NUMERO_RM`, `LIBELLE_RM`) VALUES (NULL, 'الناحية العسكرية الخامسة-قسنطينة-');
INSERT INTO `region_militaire` (`NUMERO_RM`, `LIBELLE_RM`) VALUES (NULL, 'الناحية العسكرية السادسة-تمنراست-');

/*==============================================================*/
/* Table: ROLE_PERSON                                           */
/*==============================================================*/
INSERT INTO `role_person` (`CODE_R`, `LIBELLE_ROLE`) VALUES (NULL, 'سائق');
INSERT INTO `role_person` (`CODE_R`, `LIBELLE_ROLE`) VALUES (NULL, 'راكب');
INSERT INTO `role_person` (`CODE_R`, `LIBELLE_ROLE`) VALUES (NULL, 'مترجل');
INSERT INTO `role_person` (`CODE_R`, `LIBELLE_ROLE`) VALUES (NULL, 'مالك');

/*==============================================================*/
/* Table: SITUATION_FAMILIALLE                                  */
/*==============================================================*/
INSERT INTO `situation_familialle` (`CODE_SF`, `LIBELLE_SF`) VALUES (NULL, 'متزوج (ة)');
INSERT INTO `situation_familialle` (`CODE_SF`, `LIBELLE_SF`) VALUES (NULL, 'أعزب (ة)');
INSERT INTO `situation_familialle` (`CODE_SF`, `LIBELLE_SF`) VALUES (NULL, 'مطلق (ة)');
INSERT INTO `situation_familialle` (`CODE_SF`, `LIBELLE_SF`) VALUES (NULL, 'مقبل (ة)  على الزواج ');

/*==============================================================*/
/* Table: SITUATION_PERSON                                      */
/*==============================================================*/

INSERT INTO `situation_person` (`CODE_SP`, `LIBELLE_SP`) VALUES (NULL, 'مهمة');
INSERT INTO `situation_person` (`CODE_SP`, `LIBELLE_SP`) VALUES (NULL, 'عطلة');
INSERT INTO `situation_person` (`CODE_SP`, `LIBELLE_SP`) VALUES (NULL, 'اجازة');
INSERT INTO `situation_person` (`CODE_SP`, `LIBELLE_SP`) VALUES (NULL, 'نقاهة');
INSERT INTO `situation_person` (`CODE_SP`, `LIBELLE_SP`) VALUES (NULL, 'تنقيل');

/*==============================================================*/
/* Table: WILAYA                                                */
/*==============================================================*/
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '6', NULL, '01', 'ادرار');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '1', NULL, '02', 'شلف');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '2', NULL, '03', 'الاغواط');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '5', NULL, '04', 'ام البواقي');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '5', NULL, '05', 'باتنة');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '5', NULL, '06', 'بجاية');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '5', NULL, '07', 'بسكرة');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '3', NULL, '08', 'بشار');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '1', NULL, '09', 'بليدة');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '1', NULL, '10', 'بويرة');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '6', NULL, '11', 'تمنراست');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '5', NULL, '12', 'تبسة');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '2', NULL, '13', 'تلمسان');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '2', NULL, '14', 'تيارت');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '1', NULL, '15', 'تيزي وزو');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '1', NULL, '16', 'الجزائر');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '1', NULL, '17', 'الجلفة');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '5', NULL, '18', 'جيجل');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '5', NULL, '19', 'سطيف');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '2', NULL, '20', 'سعيدة');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '5', NULL, '21', 'سكيكدة');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '2', NULL, '22', 'بلعباس');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '5', NULL, '23', 'عنابة');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '5', NULL, '24', 'قالمة');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '5', NULL, '25', 'قسنطينة');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '1', NULL, '26', 'مدية');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '2', NULL, '27', 'مستغانم');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '1', NULL, '28', 'امسيلة');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '2', NULL, '29', 'معسكر');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '4', NULL, '30', 'ورقلة');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '2', NULL, '31', 'وهران');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '3', NULL, '32', 'االبيض');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '6', NULL, '33', 'ايليزي');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '5', NULL, '34', 'برج بوعريريج');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '1', NULL, '35', 'بومرداس');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '5', NULL, '36', 'الطارف');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '3', NULL, '37', 'تندوف');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '4', NULL, '37', 'ايسمسيلت');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '4', NULL, '39', 'االوادي');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '5', NULL, '40', 'خنشلة');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '5', NULL, '41', 'سوق أهراس');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '1', NULL, '42', 'تيبازة');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '5', NULL, '43', 'ميلة');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '1', NULL, '44', 'عين الدفلى');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '3', NULL, '45', 'النعامة');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '2', NULL, '46', 'عين تموشنت');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '4', NULL, '47', 'غرداية');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '2', NULL, '48', 'غليزان');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '6', NULL, '49', 'تيميمون');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '6', NULL, '50', 'برج باجي مختار');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '5', NULL, '51', 'أولاد جلال');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '3', NULL, '52', 'بني عباس');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '6', NULL, '53', 'عين صالح');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '6', NULL, '54', 'عين قزام');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '5', NULL, '55', 'توقرت');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '6', NULL, '56', 'جانت');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '6', NULL, '57', 'المغير');
INSERT INTO `wilaya` (`NUMERO_WILAYA`, `NUMERO_RM`, `CODE_GGN`, `LIBELLE_WILAYA`, `NOM_WILAYA`) VALUES (NULL, '3', NULL, '58', 'المنيعة');


/*==============================================================*/
/* Table: UNITE_MILITAIRE                                       */
/*==============================================================*/

INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '1', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '2', NULL, '-الفرقة الاقليمية الثانية الدرك الوطن -الشهيد فلان ولد فلان-');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '3', NULL, '-الفرقة الاقليمية 3 الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '4', NULL, '-الفرقة الاقليمية 4 الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '5', NULL, '-الفرقة الاقليمية 6 الدرك الوطن -الشهيد فلان ولد فلان-');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '6', NULL, '-الفرقة الاقليمية 6 الدرك الوطن -الشهيد فلان ولد فلان-');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '7', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '8', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '9', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '10', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '11', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '12', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '13', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '14', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '15', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '16', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '17', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '18', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '19', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '20', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '21', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '22', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '23', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '24', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '25', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '26', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '27', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '28', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '29', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '30', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '31', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '32', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '33', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '34', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '35', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '36', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '37', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '38', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '39', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '40', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '41', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '42', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '43', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '44', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '45', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '46', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '47', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '48', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '49', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '50', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '51', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '52', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '53', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '54', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '55', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '56', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '57', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');
INSERT INTO `unite_militaire` (`CODE_UM`, `NUMERO_WILAYA`, `UNI_CODE_UM`, `LIBELLE_UM`) VALUES (NULL, '58', NULL, '-الفرقة الاقليمية الاولى الدرك الوطن -الشهيد فلان ولد فلان- ');

/*==============================================================*/
/* Table: WILAYA                                                */
/*==============================================================*/
UPDATE `wilaya` SET `CODE_GGN`= 1 WHERE `NUMERO_WILAYA`= 1;
UPDATE `wilaya` SET `CODE_GGN`= 2 WHERE `NUMERO_WILAYA`= 2;
UPDATE `wilaya` SET `CODE_GGN`= 3 WHERE `NUMERO_WILAYA`= 3;
UPDATE `wilaya` SET `CODE_GGN`= 4 WHERE `NUMERO_WILAYA`= 4;
UPDATE `wilaya` SET `CODE_GGN`= 5 WHERE `NUMERO_WILAYA`= 5;
UPDATE `wilaya` SET `CODE_GGN`= 6 WHERE `NUMERO_WILAYA`= 6;
UPDATE `wilaya` SET `CODE_GGN`= 7 WHERE `NUMERO_WILAYA`= 7;
UPDATE `wilaya` SET `CODE_GGN`= 8 WHERE `NUMERO_WILAYA`= 8;
UPDATE `wilaya` SET `CODE_GGN`= 9 WHERE `NUMERO_WILAYA`= 9;
UPDATE `wilaya` SET `CODE_GGN`= 10 WHERE `NUMERO_WILAYA`= 10;
UPDATE `wilaya` SET `CODE_GGN`= 11 WHERE `NUMERO_WILAYA`= 11;
UPDATE `wilaya` SET `CODE_GGN`= 12 WHERE `NUMERO_WILAYA`= 12;
UPDATE `wilaya` SET `CODE_GGN`= 13 WHERE `NUMERO_WILAYA`= 13;
UPDATE `wilaya` SET `CODE_GGN`= 14 WHERE `NUMERO_WILAYA`= 14;
UPDATE `wilaya` SET `CODE_GGN`= 15 WHERE `NUMERO_WILAYA`= 15;
UPDATE `wilaya` SET `CODE_GGN`= 16 WHERE `NUMERO_WILAYA`= 16;
UPDATE `wilaya` SET `CODE_GGN`= 17 WHERE `NUMERO_WILAYA`= 17;
UPDATE `wilaya` SET `CODE_GGN`= 18 WHERE `NUMERO_WILAYA`= 18;
UPDATE `wilaya` SET `CODE_GGN`= 19 WHERE `NUMERO_WILAYA`= 19;
UPDATE `wilaya` SET `CODE_GGN`= 20 WHERE `NUMERO_WILAYA`= 20;
UPDATE `wilaya` SET `CODE_GGN`= 21 WHERE `NUMERO_WILAYA`= 21;
UPDATE `wilaya` SET `CODE_GGN`= 22 WHERE `NUMERO_WILAYA`= 22;
UPDATE `wilaya` SET `CODE_GGN`= 23 WHERE `NUMERO_WILAYA`= 23;
UPDATE `wilaya` SET `CODE_GGN`= 24 WHERE `NUMERO_WILAYA`= 24;
UPDATE `wilaya` SET `CODE_GGN`= 25 WHERE `NUMERO_WILAYA`= 25;
UPDATE `wilaya` SET `CODE_GGN`= 26 WHERE `NUMERO_WILAYA`= 26;
UPDATE `wilaya` SET `CODE_GGN`= 27 WHERE `NUMERO_WILAYA`= 27;
UPDATE `wilaya` SET `CODE_GGN`= 28 WHERE `NUMERO_WILAYA`= 28;
UPDATE `wilaya` SET `CODE_GGN`= 29 WHERE `NUMERO_WILAYA`= 29;
UPDATE `wilaya` SET `CODE_GGN`= 30 WHERE `NUMERO_WILAYA`= 30;
UPDATE `wilaya` SET `CODE_GGN`= 31 WHERE `NUMERO_WILAYA`= 31;
UPDATE `wilaya` SET `CODE_GGN`= 32 WHERE `NUMERO_WILAYA`= 32;
UPDATE `wilaya` SET `CODE_GGN`= 33 WHERE `NUMERO_WILAYA`= 33;
UPDATE `wilaya` SET `CODE_GGN`= 34 WHERE `NUMERO_WILAYA`= 34;
UPDATE `wilaya` SET `CODE_GGN`= 35 WHERE `NUMERO_WILAYA`= 35;
UPDATE `wilaya` SET `CODE_GGN`= 36 WHERE `NUMERO_WILAYA`= 36;
UPDATE `wilaya` SET `CODE_GGN`= 37 WHERE `NUMERO_WILAYA`= 37;
UPDATE `wilaya` SET `CODE_GGN`= 38 WHERE `NUMERO_WILAYA`= 38;
UPDATE `wilaya` SET `CODE_GGN`= 39 WHERE `NUMERO_WILAYA`= 39;
UPDATE `wilaya` SET `CODE_GGN`= 40 WHERE `NUMERO_WILAYA`= 40;
UPDATE `wilaya` SET `CODE_GGN`= 41 WHERE `NUMERO_WILAYA`= 41;
UPDATE `wilaya` SET `CODE_GGN`= 42 WHERE `NUMERO_WILAYA`= 42;
UPDATE `wilaya` SET `CODE_GGN`= 43 WHERE `NUMERO_WILAYA`= 43;
UPDATE `wilaya` SET `CODE_GGN`= 44 WHERE `NUMERO_WILAYA`= 44;
UPDATE `wilaya` SET `CODE_GGN`= 45 WHERE `NUMERO_WILAYA`= 45;
UPDATE `wilaya` SET `CODE_GGN`= 46 WHERE `NUMERO_WILAYA`= 46;
UPDATE `wilaya` SET `CODE_GGN`= 47 WHERE `NUMERO_WILAYA`= 47;
UPDATE `wilaya` SET `CODE_GGN`= 48 WHERE `NUMERO_WILAYA`= 48;
UPDATE `wilaya` SET `CODE_GGN`= 49 WHERE `NUMERO_WILAYA`= 49;
UPDATE `wilaya` SET `CODE_GGN`= 50 WHERE `NUMERO_WILAYA`= 50;
UPDATE `wilaya` SET `CODE_GGN`= 51 WHERE `NUMERO_WILAYA`= 51;
UPDATE `wilaya` SET `CODE_GGN`= 52 WHERE `NUMERO_WILAYA`= 52;
UPDATE `wilaya` SET `CODE_GGN`= 53 WHERE `NUMERO_WILAYA`= 53;
UPDATE `wilaya` SET `CODE_GGN`= 54 WHERE `NUMERO_WILAYA`= 54;
UPDATE `wilaya` SET `CODE_GGN`= 55 WHERE `NUMERO_WILAYA`= 55;
UPDATE `wilaya` SET `CODE_GGN`= 56 WHERE `NUMERO_WILAYA`= 56;
UPDATE `wilaya` SET `CODE_GGN`= 57 WHERE `NUMERO_WILAYA`= 57;
UPDATE `wilaya` SET `CODE_GGN`= 58 WHERE `NUMERO_WILAYA`= 58;

/*==============================================================*/
/* Table: TYPE_VEHICULE                                         */
/*==============================================================*/
INSERT INTO `type_vehicule` (`CODE_TV`, `LIBELLE_T`) VALUES (NULL, 'سيارة');
INSERT INTO `type_vehicule` (`CODE_TV`, `LIBELLE_T`) VALUES (NULL, 'شاحنة');
INSERT INTO `type_vehicule` (`CODE_TV`, `LIBELLE_T`) VALUES (NULL, 'دراجة نارية');
INSERT INTO `type_vehicule` (`CODE_TV`, `LIBELLE_T`) VALUES (NULL, 'جرار');





