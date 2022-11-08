<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>body_var ID, TYPE        function unloadPag_aaf0a7</name>
   <tag></tag>
   <elementGuidId>2868bb40-1324-4c0b-bfd2-0ebaa315be5b</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//body</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>body.ui-layout-container</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>body</value>
      <webElementGuid>4c3bc137-f708-4b5c-9769-9981488fafc5</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>ui-layout-container</value>
      <webElementGuid>377da68d-529d-4adc-8110-34aae3305f3e</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>










    
        var ID, TYPE;

        function unloadPage() {
            console.log('222');
            unload();
        }
        function unload() {
            makeRequest( );
        }
        window.onbeforeunload = unloadPage;



        var facilityLicense;
        function loadRtlStyle(hrefpath) {
        }

        function removeRtlStyle() {
        }
        function applyEnglishLanguage() {
            deleteLang();
            setLang(&quot;lang&quot;, &quot;en&quot;, 365);
        }
        function applyArabicLanguage() {
            deleteLang();
            setLang(&quot;lang&quot;, &quot;ar&quot;, 365);
        }
        function setLang(cname, cvalue, exdays) {
            var d = new Date();
            d.setTime(d.getTime() + (exdays * 24 * 60 * 60 * 1000));
            var expires = &quot;expires=&quot; + d.toUTCString();
            document.cookie = cname + &quot;=&quot; + cvalue + &quot;;&quot; + expires + &quot;;path=/&quot;;
        }
        function getCurrentLangUpdate(cname) {
            var name = cname + &quot;=&quot;;
            var decodedCookie = decodeURIComponent(document.cookie);
            var ca = decodedCookie.split(';');
            for (var i = 0; i != ca.length; i++) {
                var c = ca[i];
                while (c.charAt(0) == ' ') {
                    c = c.substring(1);
                }
                if (c.indexOf(name) == 0) {
                    return c.substring(name.length, c.length);
                }
            }
            return &quot;&quot;;
        }
        function getCurrentLang(cname) {

            var name = cname + &quot;=&quot;;
            var decodedCookie = decodeURIComponent(document.cookie);
            var ca = decodedCookie.split(';');
            for (var i = 0; i != ca.length; i++) {
                var c = ca[i];
                while (c.charAt(0) == ' ') {
                    c = c.substring(1);
                }
                if (c.indexOf(name) == 0) {
                    return c.substring(name.length, c.length);
                }
            }
        }

        function deleteLang() {
            document.cookie = &quot;lang=; expires=Thu, 01 Jan 1970 00:00:00 UTC; path=/;&quot;;
        }

//           jQuery(function ($) {
//               if (getCurrentLang('lang') === 'ar') {
//                   var hrefCSS = '../resources/css/bootstrap-rtl.css';
//                   loadRtlStyle(hrefCSS);
//               }
//            });
        var refreshArabicCss = false;
        function checkArabic() {
            if (getCurrentLang('lang') == 'ar') {

                let headelements = document.getElementsByTagName('head');
                for (var i = 0; i != headelements.length; i++) {
                    let headelement = document.getElementsByTagName('head')[i];
                    if (true) {
                        var x1 = document.getElementsByClassName('header');
                        if (x1[0].children[0].innerHTML != 'الرئيسية')
                        {
//      
                            setTimeout(refreshPage, 1000);
                        }

                    }
                }
            }
        }



        $(document).ready(function () {
        });
        function refreshPage() {
            location.reload();
        }
    

    
    
    
    


myCommand = function() {PrimeFaces.ab({s:&quot;j_idt27:j_idt28&quot;,f:&quot;j_idt27&quot;,pa:arguments[0]});}



HomePatient Journey Management Data Entry View VisitsCheck EligibilityOut Patient AuthorizationsIn Patient AuthorizationsOP BillingServicesOP ReceiptsER ReceiptsIP BillingIP BillsIP ReceiptsIP Performa Collections Daily collection Collection Daily Report Advanced Collection Report Deliver money to cashier administrator Settlement Receivable Advance CollectionRefund AdvanceRefund ReceiptsInstallment Definitions Patient Users Roles ContractUpload prices Manage Contracts Manage Price List Append Price Manage Payers Companies ProfilesClinicians Codes Mapping HL7 Log Sent Messages Log View System Configuration Financial Accounts Setup Login Audit Back Office Management Batch Coding Auditing Submission Claim Submission Batch Submission Payment Management Upload Remittance Denial Management MIS Reports Visit Report Recalculate Batch Update StageAccount ReceivablesCompany Receipt Credit Note Debit NotePost TransactionDaily Patient Invoices TransactionsDaily Patient Advance TransactionsMonthly Insurance Invoices Transactions Companies Payments TransactionsReports









                    

                    
                        
                        
                    
root (King Salman Abdulaziz Hospital -Riyadh)HospitalKing Salman Abdulaziz Hospital -Riyadh                                                 
                                            Al Yamamah Hospital - Riyadh                                                 
                                            ALIMAN GENERAL HOSPITAL                                                 
                                            Al-Jubail General Hospital - Jubail                                                 
                                            Al-Qrayat General Hospital                                                 
                                            Children Hospital in Taif                                                 
                                            Dubaa General Hospital-Tabouk                                                 
                                            Khamis Mushayt Maternity and children Hospital                                                 
                                            King Abdul Aziz Hospital and Oncology- Jeddah                                                 
                                            King Abdullah Hospital - Beshah                                                 
                                            King Fahad Central Hospital - Hafouf                                                 
                                            King Fahad Hospital - Al Baha                                                 
                                            King Fahad Hospital -Jeddah                                                 
                                            King Faisal Hospital-Taif                                                 
                                            King Khaled Hospital - Hafer Al Baten                                                 
                                            King Khaled Hospital  -Hail                                                 
                                            King Khaled Hospital -Najran                                                 
                                            King Khalid Hospital-Tabouk                                                 
                                            Maternity &amp; Children Hospital - Aljouf                                                 
                                            Maternity &amp; Children Hospital – Tabuk                                                 
                                            Maternity and Children Hospital -Hail                                                 
                                            Maternity and Children Hospital-Najran                                                 
                                            Ohod General Hospital -Medinah                                                 
                                            Prince Moteb bin Abdulaziz Hospital- Aljouf                                                 
                                            Rabigh Hospital                                                 
                                            Sabya General Hospital - Sabya                                                 
                                            Tarif General Hospital - Tarif                                                 
                                            Abqaiq                                                 
                                            Al Hasa                                                 
                                            Udhailiyah                                                 
                                            Dhahran                                                 
                                            اللغة العربيةEnglishUser InfoLOGOUT







HomeBack Office ManagementMIS Reportsfocus = function() {PrimeFaces.ab({s:&quot;mainForm:j_idt182&quot;,f:&quot;mainForm&quot;,u:&quot;mainForm:facilityLicense&quot;,onco:function(xhr,status,args){checkChangeLicense();;},pa:arguments[0]});};$(function() {focus();});






Select Report
Monthly RevenueDepartment wise Patient count for Service availedDepartment Wise Revenue ReportDoctor wise Patient count and RevenueDoctor wise Service item wise detailed revenueDoctor wise Patient count and Revenue









From Date
To Date
Admission Type
Clinician:




AllOPIPERAll









Generate ReportReport



                            


Monthly RevenueDepartment wise Patient count for Service availedDepartment Wise Revenue ReportDoctor wise Patient count and RevenueDoctor wise Service item wise detailed revenuePreviousNextJanFebMarAprMayJunJulAugSepOctNovDec201220132014201520162017201820192020202120222023202420252026202720282029203020312032SMTW TF S  123456789101112131415161718192021222324252627282930   AllOPIPERAllCashCREDITid(&quot;j_idt180&quot;)/div[@class=&quot;ui-layout-unit-content ui-widget-content&quot;]AllOPIPER</value>
      <webElementGuid>b4975e90-0c6f-4152-94a0-12ff0c175ff6</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[1]/body[@class=&quot;ui-layout-container&quot;]</value>
      <webElementGuid>585af81e-5630-4c23-8196-c7bf9571b80b</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//body</value>
      <webElementGuid>cc698860-9525-4513-98a9-c07a39955c59</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//body[(text() = concat(&quot;










    
        var ID, TYPE;

        function unloadPage() {
            console.log(&quot; , &quot;'&quot; , &quot;222&quot; , &quot;'&quot; , &quot;);
            unload();
        }
        function unload() {
            makeRequest( );
        }
        window.onbeforeunload = unloadPage;



        var facilityLicense;
        function loadRtlStyle(hrefpath) {
        }

        function removeRtlStyle() {
        }
        function applyEnglishLanguage() {
            deleteLang();
            setLang(&quot;lang&quot;, &quot;en&quot;, 365);
        }
        function applyArabicLanguage() {
            deleteLang();
            setLang(&quot;lang&quot;, &quot;ar&quot;, 365);
        }
        function setLang(cname, cvalue, exdays) {
            var d = new Date();
            d.setTime(d.getTime() + (exdays * 24 * 60 * 60 * 1000));
            var expires = &quot;expires=&quot; + d.toUTCString();
            document.cookie = cname + &quot;=&quot; + cvalue + &quot;;&quot; + expires + &quot;;path=/&quot;;
        }
        function getCurrentLangUpdate(cname) {
            var name = cname + &quot;=&quot;;
            var decodedCookie = decodeURIComponent(document.cookie);
            var ca = decodedCookie.split(&quot; , &quot;'&quot; , &quot;;&quot; , &quot;'&quot; , &quot;);
            for (var i = 0; i != ca.length; i++) {
                var c = ca[i];
                while (c.charAt(0) == &quot; , &quot;'&quot; , &quot; &quot; , &quot;'&quot; , &quot;) {
                    c = c.substring(1);
                }
                if (c.indexOf(name) == 0) {
                    return c.substring(name.length, c.length);
                }
            }
            return &quot;&quot;;
        }
        function getCurrentLang(cname) {

            var name = cname + &quot;=&quot;;
            var decodedCookie = decodeURIComponent(document.cookie);
            var ca = decodedCookie.split(&quot; , &quot;'&quot; , &quot;;&quot; , &quot;'&quot; , &quot;);
            for (var i = 0; i != ca.length; i++) {
                var c = ca[i];
                while (c.charAt(0) == &quot; , &quot;'&quot; , &quot; &quot; , &quot;'&quot; , &quot;) {
                    c = c.substring(1);
                }
                if (c.indexOf(name) == 0) {
                    return c.substring(name.length, c.length);
                }
            }
        }

        function deleteLang() {
            document.cookie = &quot;lang=; expires=Thu, 01 Jan 1970 00:00:00 UTC; path=/;&quot;;
        }

//           jQuery(function ($) {
//               if (getCurrentLang(&quot; , &quot;'&quot; , &quot;lang&quot; , &quot;'&quot; , &quot;) === &quot; , &quot;'&quot; , &quot;ar&quot; , &quot;'&quot; , &quot;) {
//                   var hrefCSS = &quot; , &quot;'&quot; , &quot;../resources/css/bootstrap-rtl.css&quot; , &quot;'&quot; , &quot;;
//                   loadRtlStyle(hrefCSS);
//               }
//            });
        var refreshArabicCss = false;
        function checkArabic() {
            if (getCurrentLang(&quot; , &quot;'&quot; , &quot;lang&quot; , &quot;'&quot; , &quot;) == &quot; , &quot;'&quot; , &quot;ar&quot; , &quot;'&quot; , &quot;) {

                let headelements = document.getElementsByTagName(&quot; , &quot;'&quot; , &quot;head&quot; , &quot;'&quot; , &quot;);
                for (var i = 0; i != headelements.length; i++) {
                    let headelement = document.getElementsByTagName(&quot; , &quot;'&quot; , &quot;head&quot; , &quot;'&quot; , &quot;)[i];
                    if (true) {
                        var x1 = document.getElementsByClassName(&quot; , &quot;'&quot; , &quot;header&quot; , &quot;'&quot; , &quot;);
                        if (x1[0].children[0].innerHTML != &quot; , &quot;'&quot; , &quot;الرئيسية&quot; , &quot;'&quot; , &quot;)
                        {
//      
                            setTimeout(refreshPage, 1000);
                        }

                    }
                }
            }
        }



        $(document).ready(function () {
        });
        function refreshPage() {
            location.reload();
        }
    

    
    
    
    


myCommand = function() {PrimeFaces.ab({s:&quot;j_idt27:j_idt28&quot;,f:&quot;j_idt27&quot;,pa:arguments[0]});}



HomePatient Journey Management Data Entry View VisitsCheck EligibilityOut Patient AuthorizationsIn Patient AuthorizationsOP BillingServicesOP ReceiptsER ReceiptsIP BillingIP BillsIP ReceiptsIP Performa Collections Daily collection Collection Daily Report Advanced Collection Report Deliver money to cashier administrator Settlement Receivable Advance CollectionRefund AdvanceRefund ReceiptsInstallment Definitions Patient Users Roles ContractUpload prices Manage Contracts Manage Price List Append Price Manage Payers Companies ProfilesClinicians Codes Mapping HL7 Log Sent Messages Log View System Configuration Financial Accounts Setup Login Audit Back Office Management Batch Coding Auditing Submission Claim Submission Batch Submission Payment Management Upload Remittance Denial Management MIS Reports Visit Report Recalculate Batch Update StageAccount ReceivablesCompany Receipt Credit Note Debit NotePost TransactionDaily Patient Invoices TransactionsDaily Patient Advance TransactionsMonthly Insurance Invoices Transactions Companies Payments TransactionsReports









                    

                    
                        
                        
                    
root (King Salman Abdulaziz Hospital -Riyadh)HospitalKing Salman Abdulaziz Hospital -Riyadh                                                 
                                            Al Yamamah Hospital - Riyadh                                                 
                                            ALIMAN GENERAL HOSPITAL                                                 
                                            Al-Jubail General Hospital - Jubail                                                 
                                            Al-Qrayat General Hospital                                                 
                                            Children Hospital in Taif                                                 
                                            Dubaa General Hospital-Tabouk                                                 
                                            Khamis Mushayt Maternity and children Hospital                                                 
                                            King Abdul Aziz Hospital and Oncology- Jeddah                                                 
                                            King Abdullah Hospital - Beshah                                                 
                                            King Fahad Central Hospital - Hafouf                                                 
                                            King Fahad Hospital - Al Baha                                                 
                                            King Fahad Hospital -Jeddah                                                 
                                            King Faisal Hospital-Taif                                                 
                                            King Khaled Hospital - Hafer Al Baten                                                 
                                            King Khaled Hospital  -Hail                                                 
                                            King Khaled Hospital -Najran                                                 
                                            King Khalid Hospital-Tabouk                                                 
                                            Maternity &amp; Children Hospital - Aljouf                                                 
                                            Maternity &amp; Children Hospital – Tabuk                                                 
                                            Maternity and Children Hospital -Hail                                                 
                                            Maternity and Children Hospital-Najran                                                 
                                            Ohod General Hospital -Medinah                                                 
                                            Prince Moteb bin Abdulaziz Hospital- Aljouf                                                 
                                            Rabigh Hospital                                                 
                                            Sabya General Hospital - Sabya                                                 
                                            Tarif General Hospital - Tarif                                                 
                                            Abqaiq                                                 
                                            Al Hasa                                                 
                                            Udhailiyah                                                 
                                            Dhahran                                                 
                                            اللغة العربيةEnglishUser InfoLOGOUT







HomeBack Office ManagementMIS Reportsfocus = function() {PrimeFaces.ab({s:&quot;mainForm:j_idt182&quot;,f:&quot;mainForm&quot;,u:&quot;mainForm:facilityLicense&quot;,onco:function(xhr,status,args){checkChangeLicense();;},pa:arguments[0]});};$(function() {focus();});






Select Report
Monthly RevenueDepartment wise Patient count for Service availedDepartment Wise Revenue ReportDoctor wise Patient count and RevenueDoctor wise Service item wise detailed revenueDoctor wise Patient count and Revenue









From Date
To Date
Admission Type
Clinician:




AllOPIPERAll









Generate ReportReport



                            


Monthly RevenueDepartment wise Patient count for Service availedDepartment Wise Revenue ReportDoctor wise Patient count and RevenueDoctor wise Service item wise detailed revenuePreviousNextJanFebMarAprMayJunJulAugSepOctNovDec201220132014201520162017201820192020202120222023202420252026202720282029203020312032SMTW TF S  123456789101112131415161718192021222324252627282930   AllOPIPERAllCashCREDITid(&quot;j_idt180&quot;)/div[@class=&quot;ui-layout-unit-content ui-widget-content&quot;]AllOPIPER&quot;) or . = concat(&quot;










    
        var ID, TYPE;

        function unloadPage() {
            console.log(&quot; , &quot;'&quot; , &quot;222&quot; , &quot;'&quot; , &quot;);
            unload();
        }
        function unload() {
            makeRequest( );
        }
        window.onbeforeunload = unloadPage;



        var facilityLicense;
        function loadRtlStyle(hrefpath) {
        }

        function removeRtlStyle() {
        }
        function applyEnglishLanguage() {
            deleteLang();
            setLang(&quot;lang&quot;, &quot;en&quot;, 365);
        }
        function applyArabicLanguage() {
            deleteLang();
            setLang(&quot;lang&quot;, &quot;ar&quot;, 365);
        }
        function setLang(cname, cvalue, exdays) {
            var d = new Date();
            d.setTime(d.getTime() + (exdays * 24 * 60 * 60 * 1000));
            var expires = &quot;expires=&quot; + d.toUTCString();
            document.cookie = cname + &quot;=&quot; + cvalue + &quot;;&quot; + expires + &quot;;path=/&quot;;
        }
        function getCurrentLangUpdate(cname) {
            var name = cname + &quot;=&quot;;
            var decodedCookie = decodeURIComponent(document.cookie);
            var ca = decodedCookie.split(&quot; , &quot;'&quot; , &quot;;&quot; , &quot;'&quot; , &quot;);
            for (var i = 0; i != ca.length; i++) {
                var c = ca[i];
                while (c.charAt(0) == &quot; , &quot;'&quot; , &quot; &quot; , &quot;'&quot; , &quot;) {
                    c = c.substring(1);
                }
                if (c.indexOf(name) == 0) {
                    return c.substring(name.length, c.length);
                }
            }
            return &quot;&quot;;
        }
        function getCurrentLang(cname) {

            var name = cname + &quot;=&quot;;
            var decodedCookie = decodeURIComponent(document.cookie);
            var ca = decodedCookie.split(&quot; , &quot;'&quot; , &quot;;&quot; , &quot;'&quot; , &quot;);
            for (var i = 0; i != ca.length; i++) {
                var c = ca[i];
                while (c.charAt(0) == &quot; , &quot;'&quot; , &quot; &quot; , &quot;'&quot; , &quot;) {
                    c = c.substring(1);
                }
                if (c.indexOf(name) == 0) {
                    return c.substring(name.length, c.length);
                }
            }
        }

        function deleteLang() {
            document.cookie = &quot;lang=; expires=Thu, 01 Jan 1970 00:00:00 UTC; path=/;&quot;;
        }

//           jQuery(function ($) {
//               if (getCurrentLang(&quot; , &quot;'&quot; , &quot;lang&quot; , &quot;'&quot; , &quot;) === &quot; , &quot;'&quot; , &quot;ar&quot; , &quot;'&quot; , &quot;) {
//                   var hrefCSS = &quot; , &quot;'&quot; , &quot;../resources/css/bootstrap-rtl.css&quot; , &quot;'&quot; , &quot;;
//                   loadRtlStyle(hrefCSS);
//               }
//            });
        var refreshArabicCss = false;
        function checkArabic() {
            if (getCurrentLang(&quot; , &quot;'&quot; , &quot;lang&quot; , &quot;'&quot; , &quot;) == &quot; , &quot;'&quot; , &quot;ar&quot; , &quot;'&quot; , &quot;) {

                let headelements = document.getElementsByTagName(&quot; , &quot;'&quot; , &quot;head&quot; , &quot;'&quot; , &quot;);
                for (var i = 0; i != headelements.length; i++) {
                    let headelement = document.getElementsByTagName(&quot; , &quot;'&quot; , &quot;head&quot; , &quot;'&quot; , &quot;)[i];
                    if (true) {
                        var x1 = document.getElementsByClassName(&quot; , &quot;'&quot; , &quot;header&quot; , &quot;'&quot; , &quot;);
                        if (x1[0].children[0].innerHTML != &quot; , &quot;'&quot; , &quot;الرئيسية&quot; , &quot;'&quot; , &quot;)
                        {
//      
                            setTimeout(refreshPage, 1000);
                        }

                    }
                }
            }
        }



        $(document).ready(function () {
        });
        function refreshPage() {
            location.reload();
        }
    

    
    
    
    


myCommand = function() {PrimeFaces.ab({s:&quot;j_idt27:j_idt28&quot;,f:&quot;j_idt27&quot;,pa:arguments[0]});}



HomePatient Journey Management Data Entry View VisitsCheck EligibilityOut Patient AuthorizationsIn Patient AuthorizationsOP BillingServicesOP ReceiptsER ReceiptsIP BillingIP BillsIP ReceiptsIP Performa Collections Daily collection Collection Daily Report Advanced Collection Report Deliver money to cashier administrator Settlement Receivable Advance CollectionRefund AdvanceRefund ReceiptsInstallment Definitions Patient Users Roles ContractUpload prices Manage Contracts Manage Price List Append Price Manage Payers Companies ProfilesClinicians Codes Mapping HL7 Log Sent Messages Log View System Configuration Financial Accounts Setup Login Audit Back Office Management Batch Coding Auditing Submission Claim Submission Batch Submission Payment Management Upload Remittance Denial Management MIS Reports Visit Report Recalculate Batch Update StageAccount ReceivablesCompany Receipt Credit Note Debit NotePost TransactionDaily Patient Invoices TransactionsDaily Patient Advance TransactionsMonthly Insurance Invoices Transactions Companies Payments TransactionsReports









                    

                    
                        
                        
                    
root (King Salman Abdulaziz Hospital -Riyadh)HospitalKing Salman Abdulaziz Hospital -Riyadh                                                 
                                            Al Yamamah Hospital - Riyadh                                                 
                                            ALIMAN GENERAL HOSPITAL                                                 
                                            Al-Jubail General Hospital - Jubail                                                 
                                            Al-Qrayat General Hospital                                                 
                                            Children Hospital in Taif                                                 
                                            Dubaa General Hospital-Tabouk                                                 
                                            Khamis Mushayt Maternity and children Hospital                                                 
                                            King Abdul Aziz Hospital and Oncology- Jeddah                                                 
                                            King Abdullah Hospital - Beshah                                                 
                                            King Fahad Central Hospital - Hafouf                                                 
                                            King Fahad Hospital - Al Baha                                                 
                                            King Fahad Hospital -Jeddah                                                 
                                            King Faisal Hospital-Taif                                                 
                                            King Khaled Hospital - Hafer Al Baten                                                 
                                            King Khaled Hospital  -Hail                                                 
                                            King Khaled Hospital -Najran                                                 
                                            King Khalid Hospital-Tabouk                                                 
                                            Maternity &amp; Children Hospital - Aljouf                                                 
                                            Maternity &amp; Children Hospital – Tabuk                                                 
                                            Maternity and Children Hospital -Hail                                                 
                                            Maternity and Children Hospital-Najran                                                 
                                            Ohod General Hospital -Medinah                                                 
                                            Prince Moteb bin Abdulaziz Hospital- Aljouf                                                 
                                            Rabigh Hospital                                                 
                                            Sabya General Hospital - Sabya                                                 
                                            Tarif General Hospital - Tarif                                                 
                                            Abqaiq                                                 
                                            Al Hasa                                                 
                                            Udhailiyah                                                 
                                            Dhahran                                                 
                                            اللغة العربيةEnglishUser InfoLOGOUT







HomeBack Office ManagementMIS Reportsfocus = function() {PrimeFaces.ab({s:&quot;mainForm:j_idt182&quot;,f:&quot;mainForm&quot;,u:&quot;mainForm:facilityLicense&quot;,onco:function(xhr,status,args){checkChangeLicense();;},pa:arguments[0]});};$(function() {focus();});






Select Report
Monthly RevenueDepartment wise Patient count for Service availedDepartment Wise Revenue ReportDoctor wise Patient count and RevenueDoctor wise Service item wise detailed revenueDoctor wise Patient count and Revenue









From Date
To Date
Admission Type
Clinician:




AllOPIPERAll









Generate ReportReport



                            


Monthly RevenueDepartment wise Patient count for Service availedDepartment Wise Revenue ReportDoctor wise Patient count and RevenueDoctor wise Service item wise detailed revenuePreviousNextJanFebMarAprMayJunJulAugSepOctNovDec201220132014201520162017201820192020202120222023202420252026202720282029203020312032SMTW TF S  123456789101112131415161718192021222324252627282930   AllOPIPERAllCashCREDITid(&quot;j_idt180&quot;)/div[@class=&quot;ui-layout-unit-content ui-widget-content&quot;]AllOPIPER&quot;))]</value>
      <webElementGuid>382ab9dc-3cbe-457e-9589-60cc49c83132</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
