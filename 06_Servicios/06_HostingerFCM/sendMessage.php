<?php
function send_notification ($tokens)
{

    $url = 'https://fcm.googleapis.com/fcm/send';
    $priority="high";
    $notification= array('title' => 'Hola','body' => 'primos');

    $fields = array(
         'registration_ids' => $tokens,
         'notification' => $notification
        );


    $headers = array(
        'Authorization:key=AAAAcCLk0Lc:APA91bG9rWqoRPqvFc2NzyoXSOUYZH3jIhTlFBKEDdTbhIOuBeyzSnnm-OeoQxg287qToWupfSqHaoNsjxLM40_knEhFIxFxi-zwXMSFyg97M0pBKwcZmiosxhnHzECx9wo9JW9hMieD',
        'Content-Type: application/json'
        );

   $ch = curl_init();
   curl_setopt($ch, CURLOPT_URL, $url);
   curl_setopt($ch, CURLOPT_POST, true);
   curl_setopt($ch, CURLOPT_HTTPHEADER, $headers);
   curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);
   curl_setopt ($ch, CURLOPT_SSL_VERIFYHOST, 0);
   curl_setopt($ch, CURLOPT_SSL_VERIFYPEER, false);
   curl_setopt($ch, CURLOPT_POSTFIELDS, json_encode($fields));
    // echo json_encode($fields);
   $result = curl_exec($ch);
   echo curl_error($ch);
   if ($result === FALSE) {
       die('Curl failed: ' . curl_error($ch));
   }
   curl_close($ch);
   return $result;
}
$tokens = array('ezX0JsThbOI:APA91bGeBpDa3u9iHCKL0LT-cUKDcf1GrmHe_XaBYXTlTahxYXnlRgCY8wnzpuD6friMHYuHu7W8zrRKsYmbbz_3mJDSYExH3QkGHs_9RVBxC8sAgXxD1Tho4ZMx8kvKFdGvHTniI2eY');

  $message_status = send_notification($tokens);
  echo $message_status;
?>
