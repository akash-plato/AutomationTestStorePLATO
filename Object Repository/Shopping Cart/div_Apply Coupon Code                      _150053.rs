<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_Apply Coupon Code                      _150053</name>
   <tag></tag>
   <elementGuidId>a8e5568a-1d2f-4b53-8fd6-0cdb68db1be3</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//div[@id='maincontainer']/div/div/div/div/div</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>div.cart-info.coupon-estimate.container-fluid</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <smartLocatorCollection>
      <entry>
         <key>SMART_LOCATOR</key>
         <value>.contentpanel > div >> nth=0</value>
      </entry>
   </smartLocatorCollection>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
      <webElementGuid>07067754-0489-4522-8459-339b83cf3a99</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>cart-info coupon-estimate container-fluid</value>
      <webElementGuid>384597d2-5964-42a7-9367-58a696fac244</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
                        
                    
                        
                                                        Apply Coupon Code
                                                
                        
                                Enter your code and click &quot;Apply Coupon&quot; and to see your discount instantly applied to your order.
	
		
	
	
			
			Coupon:
		    
					    
			
			Apply Coupon			
		
		
	
	

		jQuery(function ($) {
			//reset coupon
			$('.registerbox').on('click', '#remove_coupon_btn', function () {
				var $form = $(&quot;#coupon_coupon&quot;).closest('form');
				$(&quot;#coupon_coupon&quot;).val('');
				$form.append('&lt;input type=&quot;hidden&quot; name=&quot;reset_coupon&quot; value=&quot;true&quot; />');
				$form.submit();
				return false;
			});
		});

	
                        
                    
                
                                
                    
                        
                            Estimate Shipping &amp; Taxes
                        
                        
                            
                                
                                    
                                    
                                        Country and State
                                        
                                            
	
	            
			Canada			
	            
			United States			
	            
			Zambia			
	            
			Zimbabwe			
		
	 

	
		            
				Alberta				
			            
				British Columbia				
			            
				Manitoba				
			            
				New Brunswick				
			            
				Newfoundland and Labrador				
			            
				Northwest Territories				
			            
				Nova Scotia				
			            
				Nunavut				
			            
				Ontario				
			            
				Prince Edward Island				
			            
				Québec				
			            
				Saskatchewan				
			            
				Yukon Territory				
			
	

	
	$('#estimate_country').change( function(){
		$('#estimate_country_zones').load('https://sewriveting.ca/store/index.php?rt=common/zone&amp;country_id=' + encodeURIComponent($(this).val()) + '&amp;'+encodeURIComponent('zone_name=Qu%26eacute%3Bbec'));
	});
                                        
                                    
                                    
                                        ZIP/Post Code
                                        
                                            
                                            
                                                
                                                        
                                                            Estimate                                                
                                            
                                        
                                    
                                    
                                        Shipments
                                        
			Local Delivery - $3.66
			Pickup From Store - Free
			Flat Shipping Rate - $12.42
	

                                    
                                    
                                
                            
                        
                    
                
                    </value>
      <webElementGuid>131bdd73-4349-4c6d-9360-8ed6cc798f10</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;maincontainer&quot;)/div[@class=&quot;container-fluid&quot;]/div[@class=&quot;col-md-12 col-xs-12 mt20&quot;]/div[1]/div[@class=&quot;contentpanel&quot;]/div[@class=&quot;cart-info coupon-estimate container-fluid&quot;]</value>
      <webElementGuid>c99d2e16-863a-4508-89cd-4bbf3f38322b</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='maincontainer']/div/div/div/div/div</value>
      <webElementGuid>4152f951-1180-4aee-a8c9-9a9e32c9bb44</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='$13.93'])[3]/following::div[2]</value>
      <webElementGuid>72d5a85f-9745-436d-87df-e5a0403b4050</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[2]/div/div/div/div/div</value>
      <webElementGuid>a283a14f-4603-4faa-958d-f220a2a5b153</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//div[(text() = concat(&quot;
                        
                    
                        
                                                        Apply Coupon Code
                                                
                        
                                Enter your code and click &quot;Apply Coupon&quot; and to see your discount instantly applied to your order.
	
		
	
	
			
			Coupon:
		    
					    
			
			Apply Coupon			
		
		
	
	

		jQuery(function ($) {
			//reset coupon
			$(&quot; , &quot;'&quot; , &quot;.registerbox&quot; , &quot;'&quot; , &quot;).on(&quot; , &quot;'&quot; , &quot;click&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;#remove_coupon_btn&quot; , &quot;'&quot; , &quot;, function () {
				var $form = $(&quot;#coupon_coupon&quot;).closest(&quot; , &quot;'&quot; , &quot;form&quot; , &quot;'&quot; , &quot;);
				$(&quot;#coupon_coupon&quot;).val(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
				$form.append(&quot; , &quot;'&quot; , &quot;&lt;input type=&quot;hidden&quot; name=&quot;reset_coupon&quot; value=&quot;true&quot; />&quot; , &quot;'&quot; , &quot;);
				$form.submit();
				return false;
			});
		});

	
                        
                    
                
                                
                    
                        
                            Estimate Shipping &amp; Taxes
                        
                        
                            
                                
                                    
                                    
                                        Country and State
                                        
                                            
	
	            
			Canada			
	            
			United States			
	            
			Zambia			
	            
			Zimbabwe			
		
	 

	
		            
				Alberta				
			            
				British Columbia				
			            
				Manitoba				
			            
				New Brunswick				
			            
				Newfoundland and Labrador				
			            
				Northwest Territories				
			            
				Nova Scotia				
			            
				Nunavut				
			            
				Ontario				
			            
				Prince Edward Island				
			            
				Québec				
			            
				Saskatchewan				
			            
				Yukon Territory				
			
	

	
	$(&quot; , &quot;'&quot; , &quot;#estimate_country&quot; , &quot;'&quot; , &quot;).change( function(){
		$(&quot; , &quot;'&quot; , &quot;#estimate_country_zones&quot; , &quot;'&quot; , &quot;).load(&quot; , &quot;'&quot; , &quot;https://sewriveting.ca/store/index.php?rt=common/zone&amp;country_id=&quot; , &quot;'&quot; , &quot; + encodeURIComponent($(this).val()) + &quot; , &quot;'&quot; , &quot;&amp;&quot; , &quot;'&quot; , &quot;+encodeURIComponent(&quot; , &quot;'&quot; , &quot;zone_name=Qu%26eacute%3Bbec&quot; , &quot;'&quot; , &quot;));
	});
                                        
                                    
                                    
                                        ZIP/Post Code
                                        
                                            
                                            
                                                
                                                        
                                                            Estimate                                                
                                            
                                        
                                    
                                    
                                        Shipments
                                        
			Local Delivery - $3.66
			Pickup From Store - Free
			Flat Shipping Rate - $12.42
	

                                    
                                    
                                
                            
                        
                    
                
                    &quot;) or . = concat(&quot;
                        
                    
                        
                                                        Apply Coupon Code
                                                
                        
                                Enter your code and click &quot;Apply Coupon&quot; and to see your discount instantly applied to your order.
	
		
	
	
			
			Coupon:
		    
					    
			
			Apply Coupon			
		
		
	
	

		jQuery(function ($) {
			//reset coupon
			$(&quot; , &quot;'&quot; , &quot;.registerbox&quot; , &quot;'&quot; , &quot;).on(&quot; , &quot;'&quot; , &quot;click&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;#remove_coupon_btn&quot; , &quot;'&quot; , &quot;, function () {
				var $form = $(&quot;#coupon_coupon&quot;).closest(&quot; , &quot;'&quot; , &quot;form&quot; , &quot;'&quot; , &quot;);
				$(&quot;#coupon_coupon&quot;).val(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
				$form.append(&quot; , &quot;'&quot; , &quot;&lt;input type=&quot;hidden&quot; name=&quot;reset_coupon&quot; value=&quot;true&quot; />&quot; , &quot;'&quot; , &quot;);
				$form.submit();
				return false;
			});
		});

	
                        
                    
                
                                
                    
                        
                            Estimate Shipping &amp; Taxes
                        
                        
                            
                                
                                    
                                    
                                        Country and State
                                        
                                            
	
	            
			Canada			
	            
			United States			
	            
			Zambia			
	            
			Zimbabwe			
		
	 

	
		            
				Alberta				
			            
				British Columbia				
			            
				Manitoba				
			            
				New Brunswick				
			            
				Newfoundland and Labrador				
			            
				Northwest Territories				
			            
				Nova Scotia				
			            
				Nunavut				
			            
				Ontario				
			            
				Prince Edward Island				
			            
				Québec				
			            
				Saskatchewan				
			            
				Yukon Territory				
			
	

	
	$(&quot; , &quot;'&quot; , &quot;#estimate_country&quot; , &quot;'&quot; , &quot;).change( function(){
		$(&quot; , &quot;'&quot; , &quot;#estimate_country_zones&quot; , &quot;'&quot; , &quot;).load(&quot; , &quot;'&quot; , &quot;https://sewriveting.ca/store/index.php?rt=common/zone&amp;country_id=&quot; , &quot;'&quot; , &quot; + encodeURIComponent($(this).val()) + &quot; , &quot;'&quot; , &quot;&amp;&quot; , &quot;'&quot; , &quot;+encodeURIComponent(&quot; , &quot;'&quot; , &quot;zone_name=Qu%26eacute%3Bbec&quot; , &quot;'&quot; , &quot;));
	});
                                        
                                    
                                    
                                        ZIP/Post Code
                                        
                                            
                                            
                                                
                                                        
                                                            Estimate                                                
                                            
                                        
                                    
                                    
                                        Shipments
                                        
			Local Delivery - $3.66
			Pickup From Store - Free
			Flat Shipping Rate - $12.42
	

                                    
                                    
                                
                            
                        
                    
                
                    &quot;))]</value>
      <webElementGuid>3fca27af-2c9f-43a7-8a2f-1212296de01f</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
