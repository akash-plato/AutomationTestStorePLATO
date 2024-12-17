<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_Latest Products  Absolute Anti-Age Spot_899fdf</name>
   <tag></tag>
   <elementGuidId>2a45fb6d-0afd-4677-9560-c957514655d5</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//div[@id='maincontainer']/div</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>#maincontainer > div.container-fluid</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
      <webElementGuid>a0e89f66-341b-4e87-941c-07c644a5077c</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>container-fluid</value>
      <webElementGuid>1f074ede-a4f3-4211-885f-b178e5461f1d</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
				
		
	Latest Products
		
		  
			
				
			
			Absolute Anti-Age Spot Replenishing Unifying TreatmentSPF 15
						
								
									$30.78
								
			  
		  
			
				
			
			Absolue Eye Precious Cells
						
								
									$65.23
					$76.96
								
			  
		  
			
				
			
			Total Moisture Facial Cream
						
								
									$27.85
								
			  
		  
			
				
			
			Flash Bronzer Body Gel
						
								
									$21.25
					$25.29
								
			  
		
			
		
		
				
		
		
		



    
        
        
            
                                                                        
                            
                                                                        
                            
                                                                        
                            
                                                                        
                            
                            
            
                                    
                           
                        
                    
                                
            
            
                                        
                            
                        
                                

        
        
        
            
                
                    Product with options and stock locations
                    
                    
                                                
                                                            
                                    $15.39                                
                                                    
                                            

                    
                                                        
                                
                                                                                                                        
                                                                                                                                                Size EU
                                                                                                
                                                    
			EU XS (Asia M)  (14 In Stock)
			EU S (Asia L)  (3 In Stock)
			EU 2XL (Asia 5XL)  (24 In Stock)
	
*
                                                
                                            
                                                                            
                                    
                                                                                                            
                                        
                                            Qty:
                                            
                                        
                                                                                                                    

                                    
                                        
                                            Total Price:  
                                            $15.39                                        
                                    
                                    
                                    
                                    
                                                                            

                                    
                                                                                                                        
                                                                                                
    
    Add to Cart

    
    Buy Now
                                                                                        
                                                                                                                        
                                            
                                            Print                                        
                                                                            

                                                                                                        
                                
                            
                    
                
            
        
    




    
        
            
                Description
                                    Reviews (0)
                                                    Tags:
                                                    Related Products (1)
                                                            
            

                
                    Designed by slim fit style FOR men and women in highest qualities and workmanship to bring buyers A different outlook on life of fashion Casual Basic Slim Fit Polo Shirts

	100% COTTON
	If you buy these Polo shits, You'll never regret about purchase. Because it is so nice designed shirts for your daily look.
	Soft Elastic Decent slim fit &amp; Button placket &amp; sleeve ribbing with contrast trim.
	Machine Wash / Hand Wash Recommended


                    
                                                    
                                Availability: 41 In Stock                            
                                                                            Model: JDSK36                            
                                                                    

                

                                    
                        There are no reviews for this product.

                                            
                
                                    
                        
                                                            fashion
                                                            grey
                                                    
                    
                
                                    
                        
                                                            
                                    
                                    Casual 3/4 Sleeve Baseball T-Shirt
                                    

                                    
                                                                                    $10.26
                                                                            
                                
                                                    
                    
                
                
                
            
        
    



    document.addEventListener('DOMContentLoaded', function load() {
        //waiting for jquery loaded!
        if (!window.jQuery) return setTimeout(load, 50);
        //jQuery-depended code

        var orig_imgs = $('div.bigimage').html();
        var orig_thumbs = $('ul.smallimage').html();

        start_easyzoom();
        display_total_price();

        $('#current_reviews .pagination a').on('click', function () {
            $('#current_reviews').slideUp('slow')
                .load(this.href)
                .slideDown('slow');
            return false;
        });

        reload_review('https://sewriveting.ca/store/index.php?rt=product/review/review&amp;product_id=122');


        $('#product_add_to_cart').click(function () {
            $('#product').submit();
        });
        $('#review_submit').click(function () {
            review();
        });

        //process clicks in review pagination
        $('#current_reviews').on('click', '.pagination a', function () {
            reload_review($(this).attr('href'));
            return false;
        });

        /* Process images for product options */
        var $select = $('input[name^=\'option\'], select[name^=\'option\']');
        $select.change(function () {
            var valId = $(this).val();
            valId = this.type === 'checkbox' &amp;&amp; $(this).attr('data-attribute-value-id') ? $(this).attr('data-attribute-value-id') : valId;
            //skip not selected radio
            if ((this.type === 'radio' || this.type === 'checkbox') &amp;&amp; $(this).prop('checked') === false) {
                return false;
            }
            load_option_images(valId, '122');
            display_total_price();
        });

        $('input[name=quantity]').on(
            'change keyup',
            function () {
                display_total_price();
            }
        );


        $.ajax({
            url: 'https://sewriveting.ca/store/index.php?rt=common/view_count/product&amp;product_id=122',
            type: 'GET',
            dataType: 'json'
        });

        $select.change();

        function start_easyzoom() {
            // Instantiate EasyZoom instances
            var $easyzoom = $('.easyzoom').easyZoom();

            // Get an instance API
            var api1 = $easyzoom.filter('.easyzoom--with-thumbnails').data('easyZoom');
            //clean and reload existing events
            api1.teardown();
            api1._init();

            // Setup thumbnails
            $('.thumbnails .producthtumb').on('click', 'a', function (e) {
                var $this = $(this);
                e.preventDefault();
                // Use EasyZoom's `swap` method
                api1.swap($this.data('standard'), $this.attr('data-href'));
                $('.mainimage.bigimage.hidden-lg').find('img').attr('src', $this.attr('data-href'));
            });
        }

        function load_option_images(attribute_value_id, product_id) {
            var selected = {};
            var k = 0;
            $('[name^=\'option\']').each(function () {
                var valId = $(this).val();
                valId = this.type === 'checkbox' &amp;&amp; $(this).attr('data-attribute-value-id') ? $(this).attr('data-attribute-value-id') : valId;
                //skip not selected radio
                if ((this.type === 'radio' || this.type === 'checkbox') &amp;&amp; $(this).prop('checked') === false) {
                    return;
                }
                //exclude just clicked option
                if (valId === attribute_value_id) {
                    return;
                }
                selected[k] = valId;
                k++;
            });

            var data = {
                attribute_value_id: attribute_value_id,
                product_id: product_id,
                selected_options: selected
            };

            $.ajax({
                type: 'POST',
                url: 'https://sewriveting.ca/store/index.php?rt=r/product/product/get_option_resources',
                data: data,
                dataType: 'json',
                success: function (data) {
                    if (data.length === 0) {
                        return false;
                    }
                    var html1 = '',
                        html2 = '',
                        main_image = data.main;

                    if (main_image) {
                        if (main_image.origin === 'external') {
                            html1 = '&lt;a class=&quot;html_with_image&quot;>';
                            html1 += main_image.main_html + '&lt;/a>';
                        } else {
                            html1 = '&lt;a style=&quot;width:' + main_image.thumb_width + 'px; height:' + main_image.thumb_height + 'px;&quot; class=&quot;local_image&quot; href=&quot;' + main_image.main_url + '&quot;>';
                            html1 += '&lt;img style=&quot;width:' + main_image.thumb_width + 'px; height:' + main_image.thumb_height + 'px;&quot; src=&quot;' + main_image.thumb_url + '&quot; />';
                            html1 += '&lt;i class=&quot;fa fa-arrows  hidden-xs hidden-sm&quot;>&lt;/i>&lt;/a>';
                        }
                    }
                    if (data.images.length > 0) {
                        for (var img in data.images) {
                            var image = data.images[img];
                            html2 += '&lt;li class=&quot;producthtumb&quot;>';
                            var img_url = image.main_url;
                            var tmb_url = image.thumb_url;
                            var tmb2_url = image.thumb2_url;
                            if (image.origin !== 'external') {
                                html2 += '&lt;a data-href=&quot;' + image.main_url + '&quot; href=&quot;' + img_url + '&quot; data-standard=&quot;' + tmb2_url + '&quot;>&lt;img style=&quot;width:' + image.thumb_width + 'px; height:' + image.thumb_height + 'px;&quot; src=&quot;' + tmb_url + '&quot; alt=&quot;' + image.title + '&quot; title=&quot;' + image.title + '&quot; />&lt;/a>';
                            }
                            html2 += '&lt;/li>';
                        }
                    } else {
                        //no images - no action
                        return false;
                    }
                    $('div.bigimage').each(function () {
                        $(this).html(html1)
                    });
                    $('ul.smallimage').each(function () {
                        $(this).html(html2);
                    });
                    start_easyzoom();
                }
            });
        }

        function display_total_price() {

            $.ajax({
                type: 'POST',
                url: 'https://sewriveting.ca/store/index.php?rt=r/product/product/calculateTotal',
                dataType: 'json',
                data: $(&quot;#product&quot;).serialize(),

                success: function (data) {
                    if (data &amp;&amp; data.total) {
                        $('.total-price-holder').show()
                            .css('visibility', 'visible');
                        $('.total-price').html(data.total);
                    }
                }
            });

        }

        function reload_review(url) {
            $('#current_reviews').load(url);
        }

        function review() {
            var dismiss = '&lt;button type=&quot;button&quot; class=&quot;close&quot; data-dismiss=&quot;alert&quot;>&amp;times;&lt;/button>';

                        var captcha = '&amp;captcha=' + encodeURIComponent($('input[name=\'captcha\']').val());
            
            $.ajax({
                type: 'POST',
                url: 'https://sewriveting.ca/store/index.php?rt=product/review/write&amp;product_id=122',
                dataType: 'json',
                data: 'name='
                    + encodeURIComponent($('input[name=\'name\']').val())
                    + '&amp;text='
                    + encodeURIComponent($('textarea[name=\'text\']').val())
                    + '&amp;rating=' + encodeURIComponent($('input[name=\'rating\']:checked').val() ? $('input[name=\'rating\']:checked').val() : '') + captcha,
                beforeSend: function () {
                    $('.success, .warning').remove();
                    $('#review_button').attr('disabled', 'disabled');
                    $('#review_title').after('&lt;div class=&quot;wait&quot;>&lt;i class=&quot;fa fa-spinner fa-spin&quot;>&lt;/i> Please Wait!&lt;/div>');
                },
                complete: function () {
                    $('#review_button').attr('disabled', '');
                    $('.wait').remove();
                                        try {
                        resetLockBtn();
                    } catch (e) {
                    }
                },
                error: function (jqXHR, exception) {
                    var text = jqXHR.statusText + &quot;: &quot; + jqXHR.responseText;
                    $('#review .alert').remove();
                    $('#review_title').after('&lt;div class=&quot;alert alert-error alert-danger&quot;>' + dismiss + text + '&lt;/div>');
                },
                success: function (data) {
                    if (data.error) {
                        $('#review .alert').remove();
                        $('#review_title').after('&lt;div class=&quot;alert alert-error alert-danger&quot;>' + dismiss + data.error + '&lt;/div>');
                    } else {
                        $('#review .alert').remove();
                        $('#review_title').after('&lt;div class=&quot;alert alert-success&quot;>' + dismiss + data.success + '&lt;/div>');

                        $('input[name=\'name\']').val('');
                        $('textarea[name=\'text\']').val('');
                        $('input[name=\'rating\']:checked').attr('checked', '');
                        $('input[name=\'captcha\']').val('');
                    }
                    $('img#captcha_img').attr('src', $('img#captcha_img').attr('src') + '&amp;' + Math.random());
                }
            });
        }

        function wishlist_add() {
            var dismiss = '&lt;button type=&quot;button&quot; class=&quot;close&quot; data-dismiss=&quot;alert&quot;>&amp;times;&lt;/button>';
            $.ajax({
                type: 'POST',
                url: 'https://sewriveting.ca/store/index.php?rt=product/wishlist/add&amp;product_id=122',
                dataType: 'json',
                beforeSend: function () {
                    $('.success, .warning').remove();
                    $('.wishlist_add').hide();
                    $('.wishlist').after('&lt;div class=&quot;wait&quot;>&lt;i class=&quot;fa fa-spinner fa-spin&quot;>&lt;/i> Please Wait!&lt;/div>');
                },
                complete: function () {
                    $('.wait').remove();
                },
                error: function (jqXHR, exception) {
                    var text = jqXHR.statusText + &quot;: &quot; + jqXHR.responseText;
                    $('.wishlist .alert').remove();
                    $('.wishlist').after('&lt;div class=&quot;alert alert-error alert-danger&quot;>' + dismiss + text + '&lt;/div>');
                    $('.wishlist_add').show();
                },
                success: function (data) {
                    if (data.error) {
                        $('.wishlist .alert').remove();
                        $('.wishlist').after('&lt;div class=&quot;alert alert-error alert-danger&quot;>' + dismiss + data.error + '&lt;/div>');
                        $('.wishlist_add').show();
                    } else {
                        $('.wishlist .alert').remove();
                        //$('.wishlist').after('&lt;div class=&quot;alert alert-success&quot;>' + dismiss + data.success + '&lt;/div>');
                        $('.wishlist_remove').show();
                    }
                }
            });
        }

        function wishlist_remove() {
            var dismiss = '&lt;button type=&quot;button&quot; class=&quot;close&quot; data-dismiss=&quot;alert&quot;>&amp;times;&lt;/button>';
            $.ajax({
                type: 'POST',
                url: 'https://sewriveting.ca/store/index.php?rt=product/wishlist/remove&amp;product_id=122',
                dataType: 'json',
                beforeSend: function () {
                    $('.success, .warning').remove();
                    $('.wishlist_remove').hide();
                    $('.wishlist').after('&lt;div class=&quot;wait&quot;>&lt;i class=&quot;fa fa-spinner fa-spin&quot;>&lt;/i> Please Wait!&lt;/div>');
                },
                complete: function () {
                    $('.wait').remove();
                },
                error: function (jqXHR, exception) {
                    var text = jqXHR.statusText + &quot;: &quot; + jqXHR.responseText;
                    $('.wishlist .alert').remove();
                    $('.wishlist').after('&lt;div class=&quot;alert alert-error alert-danger&quot;>' + dismiss + text + '&lt;/div>');
                    $('.wishlist_remove').show();
                },
                success: function (data) {
                    if (data.error) {
                        $('.wishlist .alert').remove();
                        $('.wishlist').after('&lt;div class=&quot;alert alert-error alert-danger&quot;>' + dismiss + data.error + '&lt;/div>');
                        $('.wishlist_remove').show();
                    } else {
                        $('.wishlist .alert').remove();
                        //$('.wishlist').after('&lt;div class=&quot;alert alert-success&quot;>' + dismiss + data.success + '&lt;/div>');
                        $('.wishlist_add').show();
                    }
                }
            });
        }

        $(document).on('click','a.wishlist_add', function(e){
                e.preventDefault();
                wishlist_add();
            }
        );
        $(document).on('click','a.wishlist_remove', function(e){
                e.preventDefault();
                wishlist_remove();
            }
        );
    });

		

				

			</value>
      <webElementGuid>54ab0e2b-18e7-4eda-a70f-6b23f158d380</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;maincontainer&quot;)/div[@class=&quot;container-fluid&quot;]</value>
      <webElementGuid>c2c2079e-34a1-4b51-bbac-94625a39b642</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='maincontainer']/div</value>
      <webElementGuid>1a34122d-7f1f-4a5d-9982-fa8626e1ceb4</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Product with options and stock locations'])[2]/following::div[2]</value>
      <webElementGuid>8f38ecba-3046-454b-b690-539950e1a55b</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[2]/div</value>
      <webElementGuid>2e9b8f19-b294-474b-a9ab-28ce83f0189d</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//div[(text() = concat(&quot;
				
		
	Latest Products
		
		  
			
				
			
			Absolute Anti-Age Spot Replenishing Unifying TreatmentSPF 15
						
								
									$30.78
								
			  
		  
			
				
			
			Absolue Eye Precious Cells
						
								
									$65.23
					$76.96
								
			  
		  
			
				
			
			Total Moisture Facial Cream
						
								
									$27.85
								
			  
		  
			
				
			
			Flash Bronzer Body Gel
						
								
									$21.25
					$25.29
								
			  
		
			
		
		
				
		
		
		



    
        
        
            
                                                                        
                            
                                                                        
                            
                                                                        
                            
                                                                        
                            
                            
            
                                    
                           
                        
                    
                                
            
            
                                        
                            
                        
                                

        
        
        
            
                
                    Product with options and stock locations
                    
                    
                                                
                                                            
                                    $15.39                                
                                                    
                                            

                    
                                                        
                                
                                                                                                                        
                                                                                                                                                Size EU
                                                                                                
                                                    
			EU XS (Asia M)  (14 In Stock)
			EU S (Asia L)  (3 In Stock)
			EU 2XL (Asia 5XL)  (24 In Stock)
	
*
                                                
                                            
                                                                            
                                    
                                                                                                            
                                        
                                            Qty:
                                            
                                        
                                                                                                                    

                                    
                                        
                                            Total Price:  
                                            $15.39                                        
                                    
                                    
                                    
                                    
                                                                            

                                    
                                                                                                                        
                                                                                                
    
    Add to Cart

    
    Buy Now
                                                                                        
                                                                                                                        
                                            
                                            Print                                        
                                                                            

                                                                                                        
                                
                            
                    
                
            
        
    




    
        
            
                Description
                                    Reviews (0)
                                                    Tags:
                                                    Related Products (1)
                                                            
            

                
                    Designed by slim fit style FOR men and women in highest qualities and workmanship to bring buyers A different outlook on life of fashion Casual Basic Slim Fit Polo Shirts

	100% COTTON
	If you buy these Polo shits, You&quot; , &quot;'&quot; , &quot;ll never regret about purchase. Because it is so nice designed shirts for your daily look.
	Soft Elastic Decent slim fit &amp; Button placket &amp; sleeve ribbing with contrast trim.
	Machine Wash / Hand Wash Recommended


                    
                                                    
                                Availability: 41 In Stock                            
                                                                            Model: JDSK36                            
                                                                    

                

                                    
                        There are no reviews for this product.

                                            
                
                                    
                        
                                                            fashion
                                                            grey
                                                    
                    
                
                                    
                        
                                                            
                                    
                                    Casual 3/4 Sleeve Baseball T-Shirt
                                    

                                    
                                                                                    $10.26
                                                                            
                                
                                                    
                    
                
                
                
            
        
    



    document.addEventListener(&quot; , &quot;'&quot; , &quot;DOMContentLoaded&quot; , &quot;'&quot; , &quot;, function load() {
        //waiting for jquery loaded!
        if (!window.jQuery) return setTimeout(load, 50);
        //jQuery-depended code

        var orig_imgs = $(&quot; , &quot;'&quot; , &quot;div.bigimage&quot; , &quot;'&quot; , &quot;).html();
        var orig_thumbs = $(&quot; , &quot;'&quot; , &quot;ul.smallimage&quot; , &quot;'&quot; , &quot;).html();

        start_easyzoom();
        display_total_price();

        $(&quot; , &quot;'&quot; , &quot;#current_reviews .pagination a&quot; , &quot;'&quot; , &quot;).on(&quot; , &quot;'&quot; , &quot;click&quot; , &quot;'&quot; , &quot;, function () {
            $(&quot; , &quot;'&quot; , &quot;#current_reviews&quot; , &quot;'&quot; , &quot;).slideUp(&quot; , &quot;'&quot; , &quot;slow&quot; , &quot;'&quot; , &quot;)
                .load(this.href)
                .slideDown(&quot; , &quot;'&quot; , &quot;slow&quot; , &quot;'&quot; , &quot;);
            return false;
        });

        reload_review(&quot; , &quot;'&quot; , &quot;https://sewriveting.ca/store/index.php?rt=product/review/review&amp;product_id=122&quot; , &quot;'&quot; , &quot;);


        $(&quot; , &quot;'&quot; , &quot;#product_add_to_cart&quot; , &quot;'&quot; , &quot;).click(function () {
            $(&quot; , &quot;'&quot; , &quot;#product&quot; , &quot;'&quot; , &quot;).submit();
        });
        $(&quot; , &quot;'&quot; , &quot;#review_submit&quot; , &quot;'&quot; , &quot;).click(function () {
            review();
        });

        //process clicks in review pagination
        $(&quot; , &quot;'&quot; , &quot;#current_reviews&quot; , &quot;'&quot; , &quot;).on(&quot; , &quot;'&quot; , &quot;click&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;.pagination a&quot; , &quot;'&quot; , &quot;, function () {
            reload_review($(this).attr(&quot; , &quot;'&quot; , &quot;href&quot; , &quot;'&quot; , &quot;));
            return false;
        });

        /* Process images for product options */
        var $select = $(&quot; , &quot;'&quot; , &quot;input[name^=\&quot; , &quot;'&quot; , &quot;option\&quot; , &quot;'&quot; , &quot;], select[name^=\&quot; , &quot;'&quot; , &quot;option\&quot; , &quot;'&quot; , &quot;]&quot; , &quot;'&quot; , &quot;);
        $select.change(function () {
            var valId = $(this).val();
            valId = this.type === &quot; , &quot;'&quot; , &quot;checkbox&quot; , &quot;'&quot; , &quot; &amp;&amp; $(this).attr(&quot; , &quot;'&quot; , &quot;data-attribute-value-id&quot; , &quot;'&quot; , &quot;) ? $(this).attr(&quot; , &quot;'&quot; , &quot;data-attribute-value-id&quot; , &quot;'&quot; , &quot;) : valId;
            //skip not selected radio
            if ((this.type === &quot; , &quot;'&quot; , &quot;radio&quot; , &quot;'&quot; , &quot; || this.type === &quot; , &quot;'&quot; , &quot;checkbox&quot; , &quot;'&quot; , &quot;) &amp;&amp; $(this).prop(&quot; , &quot;'&quot; , &quot;checked&quot; , &quot;'&quot; , &quot;) === false) {
                return false;
            }
            load_option_images(valId, &quot; , &quot;'&quot; , &quot;122&quot; , &quot;'&quot; , &quot;);
            display_total_price();
        });

        $(&quot; , &quot;'&quot; , &quot;input[name=quantity]&quot; , &quot;'&quot; , &quot;).on(
            &quot; , &quot;'&quot; , &quot;change keyup&quot; , &quot;'&quot; , &quot;,
            function () {
                display_total_price();
            }
        );


        $.ajax({
            url: &quot; , &quot;'&quot; , &quot;https://sewriveting.ca/store/index.php?rt=common/view_count/product&amp;product_id=122&quot; , &quot;'&quot; , &quot;,
            type: &quot; , &quot;'&quot; , &quot;GET&quot; , &quot;'&quot; , &quot;,
            dataType: &quot; , &quot;'&quot; , &quot;json&quot; , &quot;'&quot; , &quot;
        });

        $select.change();

        function start_easyzoom() {
            // Instantiate EasyZoom instances
            var $easyzoom = $(&quot; , &quot;'&quot; , &quot;.easyzoom&quot; , &quot;'&quot; , &quot;).easyZoom();

            // Get an instance API
            var api1 = $easyzoom.filter(&quot; , &quot;'&quot; , &quot;.easyzoom--with-thumbnails&quot; , &quot;'&quot; , &quot;).data(&quot; , &quot;'&quot; , &quot;easyZoom&quot; , &quot;'&quot; , &quot;);
            //clean and reload existing events
            api1.teardown();
            api1._init();

            // Setup thumbnails
            $(&quot; , &quot;'&quot; , &quot;.thumbnails .producthtumb&quot; , &quot;'&quot; , &quot;).on(&quot; , &quot;'&quot; , &quot;click&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;a&quot; , &quot;'&quot; , &quot;, function (e) {
                var $this = $(this);
                e.preventDefault();
                // Use EasyZoom&quot; , &quot;'&quot; , &quot;s `swap` method
                api1.swap($this.data(&quot; , &quot;'&quot; , &quot;standard&quot; , &quot;'&quot; , &quot;), $this.attr(&quot; , &quot;'&quot; , &quot;data-href&quot; , &quot;'&quot; , &quot;));
                $(&quot; , &quot;'&quot; , &quot;.mainimage.bigimage.hidden-lg&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;img&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;src&quot; , &quot;'&quot; , &quot;, $this.attr(&quot; , &quot;'&quot; , &quot;data-href&quot; , &quot;'&quot; , &quot;));
            });
        }

        function load_option_images(attribute_value_id, product_id) {
            var selected = {};
            var k = 0;
            $(&quot; , &quot;'&quot; , &quot;[name^=\&quot; , &quot;'&quot; , &quot;option\&quot; , &quot;'&quot; , &quot;]&quot; , &quot;'&quot; , &quot;).each(function () {
                var valId = $(this).val();
                valId = this.type === &quot; , &quot;'&quot; , &quot;checkbox&quot; , &quot;'&quot; , &quot; &amp;&amp; $(this).attr(&quot; , &quot;'&quot; , &quot;data-attribute-value-id&quot; , &quot;'&quot; , &quot;) ? $(this).attr(&quot; , &quot;'&quot; , &quot;data-attribute-value-id&quot; , &quot;'&quot; , &quot;) : valId;
                //skip not selected radio
                if ((this.type === &quot; , &quot;'&quot; , &quot;radio&quot; , &quot;'&quot; , &quot; || this.type === &quot; , &quot;'&quot; , &quot;checkbox&quot; , &quot;'&quot; , &quot;) &amp;&amp; $(this).prop(&quot; , &quot;'&quot; , &quot;checked&quot; , &quot;'&quot; , &quot;) === false) {
                    return;
                }
                //exclude just clicked option
                if (valId === attribute_value_id) {
                    return;
                }
                selected[k] = valId;
                k++;
            });

            var data = {
                attribute_value_id: attribute_value_id,
                product_id: product_id,
                selected_options: selected
            };

            $.ajax({
                type: &quot; , &quot;'&quot; , &quot;POST&quot; , &quot;'&quot; , &quot;,
                url: &quot; , &quot;'&quot; , &quot;https://sewriveting.ca/store/index.php?rt=r/product/product/get_option_resources&quot; , &quot;'&quot; , &quot;,
                data: data,
                dataType: &quot; , &quot;'&quot; , &quot;json&quot; , &quot;'&quot; , &quot;,
                success: function (data) {
                    if (data.length === 0) {
                        return false;
                    }
                    var html1 = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;,
                        html2 = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;,
                        main_image = data.main;

                    if (main_image) {
                        if (main_image.origin === &quot; , &quot;'&quot; , &quot;external&quot; , &quot;'&quot; , &quot;) {
                            html1 = &quot; , &quot;'&quot; , &quot;&lt;a class=&quot;html_with_image&quot;>&quot; , &quot;'&quot; , &quot;;
                            html1 += main_image.main_html + &quot; , &quot;'&quot; , &quot;&lt;/a>&quot; , &quot;'&quot; , &quot;;
                        } else {
                            html1 = &quot; , &quot;'&quot; , &quot;&lt;a style=&quot;width:&quot; , &quot;'&quot; , &quot; + main_image.thumb_width + &quot; , &quot;'&quot; , &quot;px; height:&quot; , &quot;'&quot; , &quot; + main_image.thumb_height + &quot; , &quot;'&quot; , &quot;px;&quot; class=&quot;local_image&quot; href=&quot;&quot; , &quot;'&quot; , &quot; + main_image.main_url + &quot; , &quot;'&quot; , &quot;&quot;>&quot; , &quot;'&quot; , &quot;;
                            html1 += &quot; , &quot;'&quot; , &quot;&lt;img style=&quot;width:&quot; , &quot;'&quot; , &quot; + main_image.thumb_width + &quot; , &quot;'&quot; , &quot;px; height:&quot; , &quot;'&quot; , &quot; + main_image.thumb_height + &quot; , &quot;'&quot; , &quot;px;&quot; src=&quot;&quot; , &quot;'&quot; , &quot; + main_image.thumb_url + &quot; , &quot;'&quot; , &quot;&quot; />&quot; , &quot;'&quot; , &quot;;
                            html1 += &quot; , &quot;'&quot; , &quot;&lt;i class=&quot;fa fa-arrows  hidden-xs hidden-sm&quot;>&lt;/i>&lt;/a>&quot; , &quot;'&quot; , &quot;;
                        }
                    }
                    if (data.images.length > 0) {
                        for (var img in data.images) {
                            var image = data.images[img];
                            html2 += &quot; , &quot;'&quot; , &quot;&lt;li class=&quot;producthtumb&quot;>&quot; , &quot;'&quot; , &quot;;
                            var img_url = image.main_url;
                            var tmb_url = image.thumb_url;
                            var tmb2_url = image.thumb2_url;
                            if (image.origin !== &quot; , &quot;'&quot; , &quot;external&quot; , &quot;'&quot; , &quot;) {
                                html2 += &quot; , &quot;'&quot; , &quot;&lt;a data-href=&quot;&quot; , &quot;'&quot; , &quot; + image.main_url + &quot; , &quot;'&quot; , &quot;&quot; href=&quot;&quot; , &quot;'&quot; , &quot; + img_url + &quot; , &quot;'&quot; , &quot;&quot; data-standard=&quot;&quot; , &quot;'&quot; , &quot; + tmb2_url + &quot; , &quot;'&quot; , &quot;&quot;>&lt;img style=&quot;width:&quot; , &quot;'&quot; , &quot; + image.thumb_width + &quot; , &quot;'&quot; , &quot;px; height:&quot; , &quot;'&quot; , &quot; + image.thumb_height + &quot; , &quot;'&quot; , &quot;px;&quot; src=&quot;&quot; , &quot;'&quot; , &quot; + tmb_url + &quot; , &quot;'&quot; , &quot;&quot; alt=&quot;&quot; , &quot;'&quot; , &quot; + image.title + &quot; , &quot;'&quot; , &quot;&quot; title=&quot;&quot; , &quot;'&quot; , &quot; + image.title + &quot; , &quot;'&quot; , &quot;&quot; />&lt;/a>&quot; , &quot;'&quot; , &quot;;
                            }
                            html2 += &quot; , &quot;'&quot; , &quot;&lt;/li>&quot; , &quot;'&quot; , &quot;;
                        }
                    } else {
                        //no images - no action
                        return false;
                    }
                    $(&quot; , &quot;'&quot; , &quot;div.bigimage&quot; , &quot;'&quot; , &quot;).each(function () {
                        $(this).html(html1)
                    });
                    $(&quot; , &quot;'&quot; , &quot;ul.smallimage&quot; , &quot;'&quot; , &quot;).each(function () {
                        $(this).html(html2);
                    });
                    start_easyzoom();
                }
            });
        }

        function display_total_price() {

            $.ajax({
                type: &quot; , &quot;'&quot; , &quot;POST&quot; , &quot;'&quot; , &quot;,
                url: &quot; , &quot;'&quot; , &quot;https://sewriveting.ca/store/index.php?rt=r/product/product/calculateTotal&quot; , &quot;'&quot; , &quot;,
                dataType: &quot; , &quot;'&quot; , &quot;json&quot; , &quot;'&quot; , &quot;,
                data: $(&quot;#product&quot;).serialize(),

                success: function (data) {
                    if (data &amp;&amp; data.total) {
                        $(&quot; , &quot;'&quot; , &quot;.total-price-holder&quot; , &quot;'&quot; , &quot;).show()
                            .css(&quot; , &quot;'&quot; , &quot;visibility&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;visible&quot; , &quot;'&quot; , &quot;);
                        $(&quot; , &quot;'&quot; , &quot;.total-price&quot; , &quot;'&quot; , &quot;).html(data.total);
                    }
                }
            });

        }

        function reload_review(url) {
            $(&quot; , &quot;'&quot; , &quot;#current_reviews&quot; , &quot;'&quot; , &quot;).load(url);
        }

        function review() {
            var dismiss = &quot; , &quot;'&quot; , &quot;&lt;button type=&quot;button&quot; class=&quot;close&quot; data-dismiss=&quot;alert&quot;>&amp;times;&lt;/button>&quot; , &quot;'&quot; , &quot;;

                        var captcha = &quot; , &quot;'&quot; , &quot;&amp;captcha=&quot; , &quot;'&quot; , &quot; + encodeURIComponent($(&quot; , &quot;'&quot; , &quot;input[name=\&quot; , &quot;'&quot; , &quot;captcha\&quot; , &quot;'&quot; , &quot;]&quot; , &quot;'&quot; , &quot;).val());
            
            $.ajax({
                type: &quot; , &quot;'&quot; , &quot;POST&quot; , &quot;'&quot; , &quot;,
                url: &quot; , &quot;'&quot; , &quot;https://sewriveting.ca/store/index.php?rt=product/review/write&amp;product_id=122&quot; , &quot;'&quot; , &quot;,
                dataType: &quot; , &quot;'&quot; , &quot;json&quot; , &quot;'&quot; , &quot;,
                data: &quot; , &quot;'&quot; , &quot;name=&quot; , &quot;'&quot; , &quot;
                    + encodeURIComponent($(&quot; , &quot;'&quot; , &quot;input[name=\&quot; , &quot;'&quot; , &quot;name\&quot; , &quot;'&quot; , &quot;]&quot; , &quot;'&quot; , &quot;).val())
                    + &quot; , &quot;'&quot; , &quot;&amp;text=&quot; , &quot;'&quot; , &quot;
                    + encodeURIComponent($(&quot; , &quot;'&quot; , &quot;textarea[name=\&quot; , &quot;'&quot; , &quot;text\&quot; , &quot;'&quot; , &quot;]&quot; , &quot;'&quot; , &quot;).val())
                    + &quot; , &quot;'&quot; , &quot;&amp;rating=&quot; , &quot;'&quot; , &quot; + encodeURIComponent($(&quot; , &quot;'&quot; , &quot;input[name=\&quot; , &quot;'&quot; , &quot;rating\&quot; , &quot;'&quot; , &quot;]:checked&quot; , &quot;'&quot; , &quot;).val() ? $(&quot; , &quot;'&quot; , &quot;input[name=\&quot; , &quot;'&quot; , &quot;rating\&quot; , &quot;'&quot; , &quot;]:checked&quot; , &quot;'&quot; , &quot;).val() : &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) + captcha,
                beforeSend: function () {
                    $(&quot; , &quot;'&quot; , &quot;.success, .warning&quot; , &quot;'&quot; , &quot;).remove();
                    $(&quot; , &quot;'&quot; , &quot;#review_button&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;disabled&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;disabled&quot; , &quot;'&quot; , &quot;);
                    $(&quot; , &quot;'&quot; , &quot;#review_title&quot; , &quot;'&quot; , &quot;).after(&quot; , &quot;'&quot; , &quot;&lt;div class=&quot;wait&quot;>&lt;i class=&quot;fa fa-spinner fa-spin&quot;>&lt;/i> Please Wait!&lt;/div>&quot; , &quot;'&quot; , &quot;);
                },
                complete: function () {
                    $(&quot; , &quot;'&quot; , &quot;#review_button&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;disabled&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
                    $(&quot; , &quot;'&quot; , &quot;.wait&quot; , &quot;'&quot; , &quot;).remove();
                                        try {
                        resetLockBtn();
                    } catch (e) {
                    }
                },
                error: function (jqXHR, exception) {
                    var text = jqXHR.statusText + &quot;: &quot; + jqXHR.responseText;
                    $(&quot; , &quot;'&quot; , &quot;#review .alert&quot; , &quot;'&quot; , &quot;).remove();
                    $(&quot; , &quot;'&quot; , &quot;#review_title&quot; , &quot;'&quot; , &quot;).after(&quot; , &quot;'&quot; , &quot;&lt;div class=&quot;alert alert-error alert-danger&quot;>&quot; , &quot;'&quot; , &quot; + dismiss + text + &quot; , &quot;'&quot; , &quot;&lt;/div>&quot; , &quot;'&quot; , &quot;);
                },
                success: function (data) {
                    if (data.error) {
                        $(&quot; , &quot;'&quot; , &quot;#review .alert&quot; , &quot;'&quot; , &quot;).remove();
                        $(&quot; , &quot;'&quot; , &quot;#review_title&quot; , &quot;'&quot; , &quot;).after(&quot; , &quot;'&quot; , &quot;&lt;div class=&quot;alert alert-error alert-danger&quot;>&quot; , &quot;'&quot; , &quot; + dismiss + data.error + &quot; , &quot;'&quot; , &quot;&lt;/div>&quot; , &quot;'&quot; , &quot;);
                    } else {
                        $(&quot; , &quot;'&quot; , &quot;#review .alert&quot; , &quot;'&quot; , &quot;).remove();
                        $(&quot; , &quot;'&quot; , &quot;#review_title&quot; , &quot;'&quot; , &quot;).after(&quot; , &quot;'&quot; , &quot;&lt;div class=&quot;alert alert-success&quot;>&quot; , &quot;'&quot; , &quot; + dismiss + data.success + &quot; , &quot;'&quot; , &quot;&lt;/div>&quot; , &quot;'&quot; , &quot;);

                        $(&quot; , &quot;'&quot; , &quot;input[name=\&quot; , &quot;'&quot; , &quot;name\&quot; , &quot;'&quot; , &quot;]&quot; , &quot;'&quot; , &quot;).val(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
                        $(&quot; , &quot;'&quot; , &quot;textarea[name=\&quot; , &quot;'&quot; , &quot;text\&quot; , &quot;'&quot; , &quot;]&quot; , &quot;'&quot; , &quot;).val(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
                        $(&quot; , &quot;'&quot; , &quot;input[name=\&quot; , &quot;'&quot; , &quot;rating\&quot; , &quot;'&quot; , &quot;]:checked&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;checked&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
                        $(&quot; , &quot;'&quot; , &quot;input[name=\&quot; , &quot;'&quot; , &quot;captcha\&quot; , &quot;'&quot; , &quot;]&quot; , &quot;'&quot; , &quot;).val(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
                    }
                    $(&quot; , &quot;'&quot; , &quot;img#captcha_img&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;src&quot; , &quot;'&quot; , &quot;, $(&quot; , &quot;'&quot; , &quot;img#captcha_img&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;src&quot; , &quot;'&quot; , &quot;) + &quot; , &quot;'&quot; , &quot;&amp;&quot; , &quot;'&quot; , &quot; + Math.random());
                }
            });
        }

        function wishlist_add() {
            var dismiss = &quot; , &quot;'&quot; , &quot;&lt;button type=&quot;button&quot; class=&quot;close&quot; data-dismiss=&quot;alert&quot;>&amp;times;&lt;/button>&quot; , &quot;'&quot; , &quot;;
            $.ajax({
                type: &quot; , &quot;'&quot; , &quot;POST&quot; , &quot;'&quot; , &quot;,
                url: &quot; , &quot;'&quot; , &quot;https://sewriveting.ca/store/index.php?rt=product/wishlist/add&amp;product_id=122&quot; , &quot;'&quot; , &quot;,
                dataType: &quot; , &quot;'&quot; , &quot;json&quot; , &quot;'&quot; , &quot;,
                beforeSend: function () {
                    $(&quot; , &quot;'&quot; , &quot;.success, .warning&quot; , &quot;'&quot; , &quot;).remove();
                    $(&quot; , &quot;'&quot; , &quot;.wishlist_add&quot; , &quot;'&quot; , &quot;).hide();
                    $(&quot; , &quot;'&quot; , &quot;.wishlist&quot; , &quot;'&quot; , &quot;).after(&quot; , &quot;'&quot; , &quot;&lt;div class=&quot;wait&quot;>&lt;i class=&quot;fa fa-spinner fa-spin&quot;>&lt;/i> Please Wait!&lt;/div>&quot; , &quot;'&quot; , &quot;);
                },
                complete: function () {
                    $(&quot; , &quot;'&quot; , &quot;.wait&quot; , &quot;'&quot; , &quot;).remove();
                },
                error: function (jqXHR, exception) {
                    var text = jqXHR.statusText + &quot;: &quot; + jqXHR.responseText;
                    $(&quot; , &quot;'&quot; , &quot;.wishlist .alert&quot; , &quot;'&quot; , &quot;).remove();
                    $(&quot; , &quot;'&quot; , &quot;.wishlist&quot; , &quot;'&quot; , &quot;).after(&quot; , &quot;'&quot; , &quot;&lt;div class=&quot;alert alert-error alert-danger&quot;>&quot; , &quot;'&quot; , &quot; + dismiss + text + &quot; , &quot;'&quot; , &quot;&lt;/div>&quot; , &quot;'&quot; , &quot;);
                    $(&quot; , &quot;'&quot; , &quot;.wishlist_add&quot; , &quot;'&quot; , &quot;).show();
                },
                success: function (data) {
                    if (data.error) {
                        $(&quot; , &quot;'&quot; , &quot;.wishlist .alert&quot; , &quot;'&quot; , &quot;).remove();
                        $(&quot; , &quot;'&quot; , &quot;.wishlist&quot; , &quot;'&quot; , &quot;).after(&quot; , &quot;'&quot; , &quot;&lt;div class=&quot;alert alert-error alert-danger&quot;>&quot; , &quot;'&quot; , &quot; + dismiss + data.error + &quot; , &quot;'&quot; , &quot;&lt;/div>&quot; , &quot;'&quot; , &quot;);
                        $(&quot; , &quot;'&quot; , &quot;.wishlist_add&quot; , &quot;'&quot; , &quot;).show();
                    } else {
                        $(&quot; , &quot;'&quot; , &quot;.wishlist .alert&quot; , &quot;'&quot; , &quot;).remove();
                        //$(&quot; , &quot;'&quot; , &quot;.wishlist&quot; , &quot;'&quot; , &quot;).after(&quot; , &quot;'&quot; , &quot;&lt;div class=&quot;alert alert-success&quot;>&quot; , &quot;'&quot; , &quot; + dismiss + data.success + &quot; , &quot;'&quot; , &quot;&lt;/div>&quot; , &quot;'&quot; , &quot;);
                        $(&quot; , &quot;'&quot; , &quot;.wishlist_remove&quot; , &quot;'&quot; , &quot;).show();
                    }
                }
            });
        }

        function wishlist_remove() {
            var dismiss = &quot; , &quot;'&quot; , &quot;&lt;button type=&quot;button&quot; class=&quot;close&quot; data-dismiss=&quot;alert&quot;>&amp;times;&lt;/button>&quot; , &quot;'&quot; , &quot;;
            $.ajax({
                type: &quot; , &quot;'&quot; , &quot;POST&quot; , &quot;'&quot; , &quot;,
                url: &quot; , &quot;'&quot; , &quot;https://sewriveting.ca/store/index.php?rt=product/wishlist/remove&amp;product_id=122&quot; , &quot;'&quot; , &quot;,
                dataType: &quot; , &quot;'&quot; , &quot;json&quot; , &quot;'&quot; , &quot;,
                beforeSend: function () {
                    $(&quot; , &quot;'&quot; , &quot;.success, .warning&quot; , &quot;'&quot; , &quot;).remove();
                    $(&quot; , &quot;'&quot; , &quot;.wishlist_remove&quot; , &quot;'&quot; , &quot;).hide();
                    $(&quot; , &quot;'&quot; , &quot;.wishlist&quot; , &quot;'&quot; , &quot;).after(&quot; , &quot;'&quot; , &quot;&lt;div class=&quot;wait&quot;>&lt;i class=&quot;fa fa-spinner fa-spin&quot;>&lt;/i> Please Wait!&lt;/div>&quot; , &quot;'&quot; , &quot;);
                },
                complete: function () {
                    $(&quot; , &quot;'&quot; , &quot;.wait&quot; , &quot;'&quot; , &quot;).remove();
                },
                error: function (jqXHR, exception) {
                    var text = jqXHR.statusText + &quot;: &quot; + jqXHR.responseText;
                    $(&quot; , &quot;'&quot; , &quot;.wishlist .alert&quot; , &quot;'&quot; , &quot;).remove();
                    $(&quot; , &quot;'&quot; , &quot;.wishlist&quot; , &quot;'&quot; , &quot;).after(&quot; , &quot;'&quot; , &quot;&lt;div class=&quot;alert alert-error alert-danger&quot;>&quot; , &quot;'&quot; , &quot; + dismiss + text + &quot; , &quot;'&quot; , &quot;&lt;/div>&quot; , &quot;'&quot; , &quot;);
                    $(&quot; , &quot;'&quot; , &quot;.wishlist_remove&quot; , &quot;'&quot; , &quot;).show();
                },
                success: function (data) {
                    if (data.error) {
                        $(&quot; , &quot;'&quot; , &quot;.wishlist .alert&quot; , &quot;'&quot; , &quot;).remove();
                        $(&quot; , &quot;'&quot; , &quot;.wishlist&quot; , &quot;'&quot; , &quot;).after(&quot; , &quot;'&quot; , &quot;&lt;div class=&quot;alert alert-error alert-danger&quot;>&quot; , &quot;'&quot; , &quot; + dismiss + data.error + &quot; , &quot;'&quot; , &quot;&lt;/div>&quot; , &quot;'&quot; , &quot;);
                        $(&quot; , &quot;'&quot; , &quot;.wishlist_remove&quot; , &quot;'&quot; , &quot;).show();
                    } else {
                        $(&quot; , &quot;'&quot; , &quot;.wishlist .alert&quot; , &quot;'&quot; , &quot;).remove();
                        //$(&quot; , &quot;'&quot; , &quot;.wishlist&quot; , &quot;'&quot; , &quot;).after(&quot; , &quot;'&quot; , &quot;&lt;div class=&quot;alert alert-success&quot;>&quot; , &quot;'&quot; , &quot; + dismiss + data.success + &quot; , &quot;'&quot; , &quot;&lt;/div>&quot; , &quot;'&quot; , &quot;);
                        $(&quot; , &quot;'&quot; , &quot;.wishlist_add&quot; , &quot;'&quot; , &quot;).show();
                    }
                }
            });
        }

        $(document).on(&quot; , &quot;'&quot; , &quot;click&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;a.wishlist_add&quot; , &quot;'&quot; , &quot;, function(e){
                e.preventDefault();
                wishlist_add();
            }
        );
        $(document).on(&quot; , &quot;'&quot; , &quot;click&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;a.wishlist_remove&quot; , &quot;'&quot; , &quot;, function(e){
                e.preventDefault();
                wishlist_remove();
            }
        );
    });

		

				

			&quot;) or . = concat(&quot;
				
		
	Latest Products
		
		  
			
				
			
			Absolute Anti-Age Spot Replenishing Unifying TreatmentSPF 15
						
								
									$30.78
								
			  
		  
			
				
			
			Absolue Eye Precious Cells
						
								
									$65.23
					$76.96
								
			  
		  
			
				
			
			Total Moisture Facial Cream
						
								
									$27.85
								
			  
		  
			
				
			
			Flash Bronzer Body Gel
						
								
									$21.25
					$25.29
								
			  
		
			
		
		
				
		
		
		



    
        
        
            
                                                                        
                            
                                                                        
                            
                                                                        
                            
                                                                        
                            
                            
            
                                    
                           
                        
                    
                                
            
            
                                        
                            
                        
                                

        
        
        
            
                
                    Product with options and stock locations
                    
                    
                                                
                                                            
                                    $15.39                                
                                                    
                                            

                    
                                                        
                                
                                                                                                                        
                                                                                                                                                Size EU
                                                                                                
                                                    
			EU XS (Asia M)  (14 In Stock)
			EU S (Asia L)  (3 In Stock)
			EU 2XL (Asia 5XL)  (24 In Stock)
	
*
                                                
                                            
                                                                            
                                    
                                                                                                            
                                        
                                            Qty:
                                            
                                        
                                                                                                                    

                                    
                                        
                                            Total Price:  
                                            $15.39                                        
                                    
                                    
                                    
                                    
                                                                            

                                    
                                                                                                                        
                                                                                                
    
    Add to Cart

    
    Buy Now
                                                                                        
                                                                                                                        
                                            
                                            Print                                        
                                                                            

                                                                                                        
                                
                            
                    
                
            
        
    




    
        
            
                Description
                                    Reviews (0)
                                                    Tags:
                                                    Related Products (1)
                                                            
            

                
                    Designed by slim fit style FOR men and women in highest qualities and workmanship to bring buyers A different outlook on life of fashion Casual Basic Slim Fit Polo Shirts

	100% COTTON
	If you buy these Polo shits, You&quot; , &quot;'&quot; , &quot;ll never regret about purchase. Because it is so nice designed shirts for your daily look.
	Soft Elastic Decent slim fit &amp; Button placket &amp; sleeve ribbing with contrast trim.
	Machine Wash / Hand Wash Recommended


                    
                                                    
                                Availability: 41 In Stock                            
                                                                            Model: JDSK36                            
                                                                    

                

                                    
                        There are no reviews for this product.

                                            
                
                                    
                        
                                                            fashion
                                                            grey
                                                    
                    
                
                                    
                        
                                                            
                                    
                                    Casual 3/4 Sleeve Baseball T-Shirt
                                    

                                    
                                                                                    $10.26
                                                                            
                                
                                                    
                    
                
                
                
            
        
    



    document.addEventListener(&quot; , &quot;'&quot; , &quot;DOMContentLoaded&quot; , &quot;'&quot; , &quot;, function load() {
        //waiting for jquery loaded!
        if (!window.jQuery) return setTimeout(load, 50);
        //jQuery-depended code

        var orig_imgs = $(&quot; , &quot;'&quot; , &quot;div.bigimage&quot; , &quot;'&quot; , &quot;).html();
        var orig_thumbs = $(&quot; , &quot;'&quot; , &quot;ul.smallimage&quot; , &quot;'&quot; , &quot;).html();

        start_easyzoom();
        display_total_price();

        $(&quot; , &quot;'&quot; , &quot;#current_reviews .pagination a&quot; , &quot;'&quot; , &quot;).on(&quot; , &quot;'&quot; , &quot;click&quot; , &quot;'&quot; , &quot;, function () {
            $(&quot; , &quot;'&quot; , &quot;#current_reviews&quot; , &quot;'&quot; , &quot;).slideUp(&quot; , &quot;'&quot; , &quot;slow&quot; , &quot;'&quot; , &quot;)
                .load(this.href)
                .slideDown(&quot; , &quot;'&quot; , &quot;slow&quot; , &quot;'&quot; , &quot;);
            return false;
        });

        reload_review(&quot; , &quot;'&quot; , &quot;https://sewriveting.ca/store/index.php?rt=product/review/review&amp;product_id=122&quot; , &quot;'&quot; , &quot;);


        $(&quot; , &quot;'&quot; , &quot;#product_add_to_cart&quot; , &quot;'&quot; , &quot;).click(function () {
            $(&quot; , &quot;'&quot; , &quot;#product&quot; , &quot;'&quot; , &quot;).submit();
        });
        $(&quot; , &quot;'&quot; , &quot;#review_submit&quot; , &quot;'&quot; , &quot;).click(function () {
            review();
        });

        //process clicks in review pagination
        $(&quot; , &quot;'&quot; , &quot;#current_reviews&quot; , &quot;'&quot; , &quot;).on(&quot; , &quot;'&quot; , &quot;click&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;.pagination a&quot; , &quot;'&quot; , &quot;, function () {
            reload_review($(this).attr(&quot; , &quot;'&quot; , &quot;href&quot; , &quot;'&quot; , &quot;));
            return false;
        });

        /* Process images for product options */
        var $select = $(&quot; , &quot;'&quot; , &quot;input[name^=\&quot; , &quot;'&quot; , &quot;option\&quot; , &quot;'&quot; , &quot;], select[name^=\&quot; , &quot;'&quot; , &quot;option\&quot; , &quot;'&quot; , &quot;]&quot; , &quot;'&quot; , &quot;);
        $select.change(function () {
            var valId = $(this).val();
            valId = this.type === &quot; , &quot;'&quot; , &quot;checkbox&quot; , &quot;'&quot; , &quot; &amp;&amp; $(this).attr(&quot; , &quot;'&quot; , &quot;data-attribute-value-id&quot; , &quot;'&quot; , &quot;) ? $(this).attr(&quot; , &quot;'&quot; , &quot;data-attribute-value-id&quot; , &quot;'&quot; , &quot;) : valId;
            //skip not selected radio
            if ((this.type === &quot; , &quot;'&quot; , &quot;radio&quot; , &quot;'&quot; , &quot; || this.type === &quot; , &quot;'&quot; , &quot;checkbox&quot; , &quot;'&quot; , &quot;) &amp;&amp; $(this).prop(&quot; , &quot;'&quot; , &quot;checked&quot; , &quot;'&quot; , &quot;) === false) {
                return false;
            }
            load_option_images(valId, &quot; , &quot;'&quot; , &quot;122&quot; , &quot;'&quot; , &quot;);
            display_total_price();
        });

        $(&quot; , &quot;'&quot; , &quot;input[name=quantity]&quot; , &quot;'&quot; , &quot;).on(
            &quot; , &quot;'&quot; , &quot;change keyup&quot; , &quot;'&quot; , &quot;,
            function () {
                display_total_price();
            }
        );


        $.ajax({
            url: &quot; , &quot;'&quot; , &quot;https://sewriveting.ca/store/index.php?rt=common/view_count/product&amp;product_id=122&quot; , &quot;'&quot; , &quot;,
            type: &quot; , &quot;'&quot; , &quot;GET&quot; , &quot;'&quot; , &quot;,
            dataType: &quot; , &quot;'&quot; , &quot;json&quot; , &quot;'&quot; , &quot;
        });

        $select.change();

        function start_easyzoom() {
            // Instantiate EasyZoom instances
            var $easyzoom = $(&quot; , &quot;'&quot; , &quot;.easyzoom&quot; , &quot;'&quot; , &quot;).easyZoom();

            // Get an instance API
            var api1 = $easyzoom.filter(&quot; , &quot;'&quot; , &quot;.easyzoom--with-thumbnails&quot; , &quot;'&quot; , &quot;).data(&quot; , &quot;'&quot; , &quot;easyZoom&quot; , &quot;'&quot; , &quot;);
            //clean and reload existing events
            api1.teardown();
            api1._init();

            // Setup thumbnails
            $(&quot; , &quot;'&quot; , &quot;.thumbnails .producthtumb&quot; , &quot;'&quot; , &quot;).on(&quot; , &quot;'&quot; , &quot;click&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;a&quot; , &quot;'&quot; , &quot;, function (e) {
                var $this = $(this);
                e.preventDefault();
                // Use EasyZoom&quot; , &quot;'&quot; , &quot;s `swap` method
                api1.swap($this.data(&quot; , &quot;'&quot; , &quot;standard&quot; , &quot;'&quot; , &quot;), $this.attr(&quot; , &quot;'&quot; , &quot;data-href&quot; , &quot;'&quot; , &quot;));
                $(&quot; , &quot;'&quot; , &quot;.mainimage.bigimage.hidden-lg&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;img&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;src&quot; , &quot;'&quot; , &quot;, $this.attr(&quot; , &quot;'&quot; , &quot;data-href&quot; , &quot;'&quot; , &quot;));
            });
        }

        function load_option_images(attribute_value_id, product_id) {
            var selected = {};
            var k = 0;
            $(&quot; , &quot;'&quot; , &quot;[name^=\&quot; , &quot;'&quot; , &quot;option\&quot; , &quot;'&quot; , &quot;]&quot; , &quot;'&quot; , &quot;).each(function () {
                var valId = $(this).val();
                valId = this.type === &quot; , &quot;'&quot; , &quot;checkbox&quot; , &quot;'&quot; , &quot; &amp;&amp; $(this).attr(&quot; , &quot;'&quot; , &quot;data-attribute-value-id&quot; , &quot;'&quot; , &quot;) ? $(this).attr(&quot; , &quot;'&quot; , &quot;data-attribute-value-id&quot; , &quot;'&quot; , &quot;) : valId;
                //skip not selected radio
                if ((this.type === &quot; , &quot;'&quot; , &quot;radio&quot; , &quot;'&quot; , &quot; || this.type === &quot; , &quot;'&quot; , &quot;checkbox&quot; , &quot;'&quot; , &quot;) &amp;&amp; $(this).prop(&quot; , &quot;'&quot; , &quot;checked&quot; , &quot;'&quot; , &quot;) === false) {
                    return;
                }
                //exclude just clicked option
                if (valId === attribute_value_id) {
                    return;
                }
                selected[k] = valId;
                k++;
            });

            var data = {
                attribute_value_id: attribute_value_id,
                product_id: product_id,
                selected_options: selected
            };

            $.ajax({
                type: &quot; , &quot;'&quot; , &quot;POST&quot; , &quot;'&quot; , &quot;,
                url: &quot; , &quot;'&quot; , &quot;https://sewriveting.ca/store/index.php?rt=r/product/product/get_option_resources&quot; , &quot;'&quot; , &quot;,
                data: data,
                dataType: &quot; , &quot;'&quot; , &quot;json&quot; , &quot;'&quot; , &quot;,
                success: function (data) {
                    if (data.length === 0) {
                        return false;
                    }
                    var html1 = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;,
                        html2 = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;,
                        main_image = data.main;

                    if (main_image) {
                        if (main_image.origin === &quot; , &quot;'&quot; , &quot;external&quot; , &quot;'&quot; , &quot;) {
                            html1 = &quot; , &quot;'&quot; , &quot;&lt;a class=&quot;html_with_image&quot;>&quot; , &quot;'&quot; , &quot;;
                            html1 += main_image.main_html + &quot; , &quot;'&quot; , &quot;&lt;/a>&quot; , &quot;'&quot; , &quot;;
                        } else {
                            html1 = &quot; , &quot;'&quot; , &quot;&lt;a style=&quot;width:&quot; , &quot;'&quot; , &quot; + main_image.thumb_width + &quot; , &quot;'&quot; , &quot;px; height:&quot; , &quot;'&quot; , &quot; + main_image.thumb_height + &quot; , &quot;'&quot; , &quot;px;&quot; class=&quot;local_image&quot; href=&quot;&quot; , &quot;'&quot; , &quot; + main_image.main_url + &quot; , &quot;'&quot; , &quot;&quot;>&quot; , &quot;'&quot; , &quot;;
                            html1 += &quot; , &quot;'&quot; , &quot;&lt;img style=&quot;width:&quot; , &quot;'&quot; , &quot; + main_image.thumb_width + &quot; , &quot;'&quot; , &quot;px; height:&quot; , &quot;'&quot; , &quot; + main_image.thumb_height + &quot; , &quot;'&quot; , &quot;px;&quot; src=&quot;&quot; , &quot;'&quot; , &quot; + main_image.thumb_url + &quot; , &quot;'&quot; , &quot;&quot; />&quot; , &quot;'&quot; , &quot;;
                            html1 += &quot; , &quot;'&quot; , &quot;&lt;i class=&quot;fa fa-arrows  hidden-xs hidden-sm&quot;>&lt;/i>&lt;/a>&quot; , &quot;'&quot; , &quot;;
                        }
                    }
                    if (data.images.length > 0) {
                        for (var img in data.images) {
                            var image = data.images[img];
                            html2 += &quot; , &quot;'&quot; , &quot;&lt;li class=&quot;producthtumb&quot;>&quot; , &quot;'&quot; , &quot;;
                            var img_url = image.main_url;
                            var tmb_url = image.thumb_url;
                            var tmb2_url = image.thumb2_url;
                            if (image.origin !== &quot; , &quot;'&quot; , &quot;external&quot; , &quot;'&quot; , &quot;) {
                                html2 += &quot; , &quot;'&quot; , &quot;&lt;a data-href=&quot;&quot; , &quot;'&quot; , &quot; + image.main_url + &quot; , &quot;'&quot; , &quot;&quot; href=&quot;&quot; , &quot;'&quot; , &quot; + img_url + &quot; , &quot;'&quot; , &quot;&quot; data-standard=&quot;&quot; , &quot;'&quot; , &quot; + tmb2_url + &quot; , &quot;'&quot; , &quot;&quot;>&lt;img style=&quot;width:&quot; , &quot;'&quot; , &quot; + image.thumb_width + &quot; , &quot;'&quot; , &quot;px; height:&quot; , &quot;'&quot; , &quot; + image.thumb_height + &quot; , &quot;'&quot; , &quot;px;&quot; src=&quot;&quot; , &quot;'&quot; , &quot; + tmb_url + &quot; , &quot;'&quot; , &quot;&quot; alt=&quot;&quot; , &quot;'&quot; , &quot; + image.title + &quot; , &quot;'&quot; , &quot;&quot; title=&quot;&quot; , &quot;'&quot; , &quot; + image.title + &quot; , &quot;'&quot; , &quot;&quot; />&lt;/a>&quot; , &quot;'&quot; , &quot;;
                            }
                            html2 += &quot; , &quot;'&quot; , &quot;&lt;/li>&quot; , &quot;'&quot; , &quot;;
                        }
                    } else {
                        //no images - no action
                        return false;
                    }
                    $(&quot; , &quot;'&quot; , &quot;div.bigimage&quot; , &quot;'&quot; , &quot;).each(function () {
                        $(this).html(html1)
                    });
                    $(&quot; , &quot;'&quot; , &quot;ul.smallimage&quot; , &quot;'&quot; , &quot;).each(function () {
                        $(this).html(html2);
                    });
                    start_easyzoom();
                }
            });
        }

        function display_total_price() {

            $.ajax({
                type: &quot; , &quot;'&quot; , &quot;POST&quot; , &quot;'&quot; , &quot;,
                url: &quot; , &quot;'&quot; , &quot;https://sewriveting.ca/store/index.php?rt=r/product/product/calculateTotal&quot; , &quot;'&quot; , &quot;,
                dataType: &quot; , &quot;'&quot; , &quot;json&quot; , &quot;'&quot; , &quot;,
                data: $(&quot;#product&quot;).serialize(),

                success: function (data) {
                    if (data &amp;&amp; data.total) {
                        $(&quot; , &quot;'&quot; , &quot;.total-price-holder&quot; , &quot;'&quot; , &quot;).show()
                            .css(&quot; , &quot;'&quot; , &quot;visibility&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;visible&quot; , &quot;'&quot; , &quot;);
                        $(&quot; , &quot;'&quot; , &quot;.total-price&quot; , &quot;'&quot; , &quot;).html(data.total);
                    }
                }
            });

        }

        function reload_review(url) {
            $(&quot; , &quot;'&quot; , &quot;#current_reviews&quot; , &quot;'&quot; , &quot;).load(url);
        }

        function review() {
            var dismiss = &quot; , &quot;'&quot; , &quot;&lt;button type=&quot;button&quot; class=&quot;close&quot; data-dismiss=&quot;alert&quot;>&amp;times;&lt;/button>&quot; , &quot;'&quot; , &quot;;

                        var captcha = &quot; , &quot;'&quot; , &quot;&amp;captcha=&quot; , &quot;'&quot; , &quot; + encodeURIComponent($(&quot; , &quot;'&quot; , &quot;input[name=\&quot; , &quot;'&quot; , &quot;captcha\&quot; , &quot;'&quot; , &quot;]&quot; , &quot;'&quot; , &quot;).val());
            
            $.ajax({
                type: &quot; , &quot;'&quot; , &quot;POST&quot; , &quot;'&quot; , &quot;,
                url: &quot; , &quot;'&quot; , &quot;https://sewriveting.ca/store/index.php?rt=product/review/write&amp;product_id=122&quot; , &quot;'&quot; , &quot;,
                dataType: &quot; , &quot;'&quot; , &quot;json&quot; , &quot;'&quot; , &quot;,
                data: &quot; , &quot;'&quot; , &quot;name=&quot; , &quot;'&quot; , &quot;
                    + encodeURIComponent($(&quot; , &quot;'&quot; , &quot;input[name=\&quot; , &quot;'&quot; , &quot;name\&quot; , &quot;'&quot; , &quot;]&quot; , &quot;'&quot; , &quot;).val())
                    + &quot; , &quot;'&quot; , &quot;&amp;text=&quot; , &quot;'&quot; , &quot;
                    + encodeURIComponent($(&quot; , &quot;'&quot; , &quot;textarea[name=\&quot; , &quot;'&quot; , &quot;text\&quot; , &quot;'&quot; , &quot;]&quot; , &quot;'&quot; , &quot;).val())
                    + &quot; , &quot;'&quot; , &quot;&amp;rating=&quot; , &quot;'&quot; , &quot; + encodeURIComponent($(&quot; , &quot;'&quot; , &quot;input[name=\&quot; , &quot;'&quot; , &quot;rating\&quot; , &quot;'&quot; , &quot;]:checked&quot; , &quot;'&quot; , &quot;).val() ? $(&quot; , &quot;'&quot; , &quot;input[name=\&quot; , &quot;'&quot; , &quot;rating\&quot; , &quot;'&quot; , &quot;]:checked&quot; , &quot;'&quot; , &quot;).val() : &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) + captcha,
                beforeSend: function () {
                    $(&quot; , &quot;'&quot; , &quot;.success, .warning&quot; , &quot;'&quot; , &quot;).remove();
                    $(&quot; , &quot;'&quot; , &quot;#review_button&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;disabled&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;disabled&quot; , &quot;'&quot; , &quot;);
                    $(&quot; , &quot;'&quot; , &quot;#review_title&quot; , &quot;'&quot; , &quot;).after(&quot; , &quot;'&quot; , &quot;&lt;div class=&quot;wait&quot;>&lt;i class=&quot;fa fa-spinner fa-spin&quot;>&lt;/i> Please Wait!&lt;/div>&quot; , &quot;'&quot; , &quot;);
                },
                complete: function () {
                    $(&quot; , &quot;'&quot; , &quot;#review_button&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;disabled&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
                    $(&quot; , &quot;'&quot; , &quot;.wait&quot; , &quot;'&quot; , &quot;).remove();
                                        try {
                        resetLockBtn();
                    } catch (e) {
                    }
                },
                error: function (jqXHR, exception) {
                    var text = jqXHR.statusText + &quot;: &quot; + jqXHR.responseText;
                    $(&quot; , &quot;'&quot; , &quot;#review .alert&quot; , &quot;'&quot; , &quot;).remove();
                    $(&quot; , &quot;'&quot; , &quot;#review_title&quot; , &quot;'&quot; , &quot;).after(&quot; , &quot;'&quot; , &quot;&lt;div class=&quot;alert alert-error alert-danger&quot;>&quot; , &quot;'&quot; , &quot; + dismiss + text + &quot; , &quot;'&quot; , &quot;&lt;/div>&quot; , &quot;'&quot; , &quot;);
                },
                success: function (data) {
                    if (data.error) {
                        $(&quot; , &quot;'&quot; , &quot;#review .alert&quot; , &quot;'&quot; , &quot;).remove();
                        $(&quot; , &quot;'&quot; , &quot;#review_title&quot; , &quot;'&quot; , &quot;).after(&quot; , &quot;'&quot; , &quot;&lt;div class=&quot;alert alert-error alert-danger&quot;>&quot; , &quot;'&quot; , &quot; + dismiss + data.error + &quot; , &quot;'&quot; , &quot;&lt;/div>&quot; , &quot;'&quot; , &quot;);
                    } else {
                        $(&quot; , &quot;'&quot; , &quot;#review .alert&quot; , &quot;'&quot; , &quot;).remove();
                        $(&quot; , &quot;'&quot; , &quot;#review_title&quot; , &quot;'&quot; , &quot;).after(&quot; , &quot;'&quot; , &quot;&lt;div class=&quot;alert alert-success&quot;>&quot; , &quot;'&quot; , &quot; + dismiss + data.success + &quot; , &quot;'&quot; , &quot;&lt;/div>&quot; , &quot;'&quot; , &quot;);

                        $(&quot; , &quot;'&quot; , &quot;input[name=\&quot; , &quot;'&quot; , &quot;name\&quot; , &quot;'&quot; , &quot;]&quot; , &quot;'&quot; , &quot;).val(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
                        $(&quot; , &quot;'&quot; , &quot;textarea[name=\&quot; , &quot;'&quot; , &quot;text\&quot; , &quot;'&quot; , &quot;]&quot; , &quot;'&quot; , &quot;).val(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
                        $(&quot; , &quot;'&quot; , &quot;input[name=\&quot; , &quot;'&quot; , &quot;rating\&quot; , &quot;'&quot; , &quot;]:checked&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;checked&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
                        $(&quot; , &quot;'&quot; , &quot;input[name=\&quot; , &quot;'&quot; , &quot;captcha\&quot; , &quot;'&quot; , &quot;]&quot; , &quot;'&quot; , &quot;).val(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
                    }
                    $(&quot; , &quot;'&quot; , &quot;img#captcha_img&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;src&quot; , &quot;'&quot; , &quot;, $(&quot; , &quot;'&quot; , &quot;img#captcha_img&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;src&quot; , &quot;'&quot; , &quot;) + &quot; , &quot;'&quot; , &quot;&amp;&quot; , &quot;'&quot; , &quot; + Math.random());
                }
            });
        }

        function wishlist_add() {
            var dismiss = &quot; , &quot;'&quot; , &quot;&lt;button type=&quot;button&quot; class=&quot;close&quot; data-dismiss=&quot;alert&quot;>&amp;times;&lt;/button>&quot; , &quot;'&quot; , &quot;;
            $.ajax({
                type: &quot; , &quot;'&quot; , &quot;POST&quot; , &quot;'&quot; , &quot;,
                url: &quot; , &quot;'&quot; , &quot;https://sewriveting.ca/store/index.php?rt=product/wishlist/add&amp;product_id=122&quot; , &quot;'&quot; , &quot;,
                dataType: &quot; , &quot;'&quot; , &quot;json&quot; , &quot;'&quot; , &quot;,
                beforeSend: function () {
                    $(&quot; , &quot;'&quot; , &quot;.success, .warning&quot; , &quot;'&quot; , &quot;).remove();
                    $(&quot; , &quot;'&quot; , &quot;.wishlist_add&quot; , &quot;'&quot; , &quot;).hide();
                    $(&quot; , &quot;'&quot; , &quot;.wishlist&quot; , &quot;'&quot; , &quot;).after(&quot; , &quot;'&quot; , &quot;&lt;div class=&quot;wait&quot;>&lt;i class=&quot;fa fa-spinner fa-spin&quot;>&lt;/i> Please Wait!&lt;/div>&quot; , &quot;'&quot; , &quot;);
                },
                complete: function () {
                    $(&quot; , &quot;'&quot; , &quot;.wait&quot; , &quot;'&quot; , &quot;).remove();
                },
                error: function (jqXHR, exception) {
                    var text = jqXHR.statusText + &quot;: &quot; + jqXHR.responseText;
                    $(&quot; , &quot;'&quot; , &quot;.wishlist .alert&quot; , &quot;'&quot; , &quot;).remove();
                    $(&quot; , &quot;'&quot; , &quot;.wishlist&quot; , &quot;'&quot; , &quot;).after(&quot; , &quot;'&quot; , &quot;&lt;div class=&quot;alert alert-error alert-danger&quot;>&quot; , &quot;'&quot; , &quot; + dismiss + text + &quot; , &quot;'&quot; , &quot;&lt;/div>&quot; , &quot;'&quot; , &quot;);
                    $(&quot; , &quot;'&quot; , &quot;.wishlist_add&quot; , &quot;'&quot; , &quot;).show();
                },
                success: function (data) {
                    if (data.error) {
                        $(&quot; , &quot;'&quot; , &quot;.wishlist .alert&quot; , &quot;'&quot; , &quot;).remove();
                        $(&quot; , &quot;'&quot; , &quot;.wishlist&quot; , &quot;'&quot; , &quot;).after(&quot; , &quot;'&quot; , &quot;&lt;div class=&quot;alert alert-error alert-danger&quot;>&quot; , &quot;'&quot; , &quot; + dismiss + data.error + &quot; , &quot;'&quot; , &quot;&lt;/div>&quot; , &quot;'&quot; , &quot;);
                        $(&quot; , &quot;'&quot; , &quot;.wishlist_add&quot; , &quot;'&quot; , &quot;).show();
                    } else {
                        $(&quot; , &quot;'&quot; , &quot;.wishlist .alert&quot; , &quot;'&quot; , &quot;).remove();
                        //$(&quot; , &quot;'&quot; , &quot;.wishlist&quot; , &quot;'&quot; , &quot;).after(&quot; , &quot;'&quot; , &quot;&lt;div class=&quot;alert alert-success&quot;>&quot; , &quot;'&quot; , &quot; + dismiss + data.success + &quot; , &quot;'&quot; , &quot;&lt;/div>&quot; , &quot;'&quot; , &quot;);
                        $(&quot; , &quot;'&quot; , &quot;.wishlist_remove&quot; , &quot;'&quot; , &quot;).show();
                    }
                }
            });
        }

        function wishlist_remove() {
            var dismiss = &quot; , &quot;'&quot; , &quot;&lt;button type=&quot;button&quot; class=&quot;close&quot; data-dismiss=&quot;alert&quot;>&amp;times;&lt;/button>&quot; , &quot;'&quot; , &quot;;
            $.ajax({
                type: &quot; , &quot;'&quot; , &quot;POST&quot; , &quot;'&quot; , &quot;,
                url: &quot; , &quot;'&quot; , &quot;https://sewriveting.ca/store/index.php?rt=product/wishlist/remove&amp;product_id=122&quot; , &quot;'&quot; , &quot;,
                dataType: &quot; , &quot;'&quot; , &quot;json&quot; , &quot;'&quot; , &quot;,
                beforeSend: function () {
                    $(&quot; , &quot;'&quot; , &quot;.success, .warning&quot; , &quot;'&quot; , &quot;).remove();
                    $(&quot; , &quot;'&quot; , &quot;.wishlist_remove&quot; , &quot;'&quot; , &quot;).hide();
                    $(&quot; , &quot;'&quot; , &quot;.wishlist&quot; , &quot;'&quot; , &quot;).after(&quot; , &quot;'&quot; , &quot;&lt;div class=&quot;wait&quot;>&lt;i class=&quot;fa fa-spinner fa-spin&quot;>&lt;/i> Please Wait!&lt;/div>&quot; , &quot;'&quot; , &quot;);
                },
                complete: function () {
                    $(&quot; , &quot;'&quot; , &quot;.wait&quot; , &quot;'&quot; , &quot;).remove();
                },
                error: function (jqXHR, exception) {
                    var text = jqXHR.statusText + &quot;: &quot; + jqXHR.responseText;
                    $(&quot; , &quot;'&quot; , &quot;.wishlist .alert&quot; , &quot;'&quot; , &quot;).remove();
                    $(&quot; , &quot;'&quot; , &quot;.wishlist&quot; , &quot;'&quot; , &quot;).after(&quot; , &quot;'&quot; , &quot;&lt;div class=&quot;alert alert-error alert-danger&quot;>&quot; , &quot;'&quot; , &quot; + dismiss + text + &quot; , &quot;'&quot; , &quot;&lt;/div>&quot; , &quot;'&quot; , &quot;);
                    $(&quot; , &quot;'&quot; , &quot;.wishlist_remove&quot; , &quot;'&quot; , &quot;).show();
                },
                success: function (data) {
                    if (data.error) {
                        $(&quot; , &quot;'&quot; , &quot;.wishlist .alert&quot; , &quot;'&quot; , &quot;).remove();
                        $(&quot; , &quot;'&quot; , &quot;.wishlist&quot; , &quot;'&quot; , &quot;).after(&quot; , &quot;'&quot; , &quot;&lt;div class=&quot;alert alert-error alert-danger&quot;>&quot; , &quot;'&quot; , &quot; + dismiss + data.error + &quot; , &quot;'&quot; , &quot;&lt;/div>&quot; , &quot;'&quot; , &quot;);
                        $(&quot; , &quot;'&quot; , &quot;.wishlist_remove&quot; , &quot;'&quot; , &quot;).show();
                    } else {
                        $(&quot; , &quot;'&quot; , &quot;.wishlist .alert&quot; , &quot;'&quot; , &quot;).remove();
                        //$(&quot; , &quot;'&quot; , &quot;.wishlist&quot; , &quot;'&quot; , &quot;).after(&quot; , &quot;'&quot; , &quot;&lt;div class=&quot;alert alert-success&quot;>&quot; , &quot;'&quot; , &quot; + dismiss + data.success + &quot; , &quot;'&quot; , &quot;&lt;/div>&quot; , &quot;'&quot; , &quot;);
                        $(&quot; , &quot;'&quot; , &quot;.wishlist_add&quot; , &quot;'&quot; , &quot;).show();
                    }
                }
            });
        }

        $(document).on(&quot; , &quot;'&quot; , &quot;click&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;a.wishlist_add&quot; , &quot;'&quot; , &quot;, function(e){
                e.preventDefault();
                wishlist_add();
            }
        );
        $(document).on(&quot; , &quot;'&quot; , &quot;click&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;a.wishlist_remove&quot; , &quot;'&quot; , &quot;, function(e){
                e.preventDefault();
                wishlist_remove();
            }
        );
    });

		

				

			&quot;))]</value>
      <webElementGuid>cb518cdc-1ec1-445d-85f6-2fa37215d956</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
