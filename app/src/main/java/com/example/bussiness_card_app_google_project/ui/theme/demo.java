//package com.example.bussiness_card_app_google_project.ui.theme;
//
//@Composable
//fun BusinessCard() {
//        Column(
//        modifier = Modifier
//        .fillMaxHeight()
//        .fillMaxWidth()
//        .background(color = Color.DarkGray)
//        ,
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//        ){
//        val image = painterResource(id = R.drawable.android_logo)
//        Image(painter = image, contentDescription = null, modifier = Modifier
//        .height(120.dp)
//        .width(150.dp))
//        Text(text = stringResource(R.string.name_surname),color = Color.White)
//        Text(text = stringResource(R.string.business),color = Color(0xFF3ddc84))
//
//        }
//        Column(
//        modifier = Modifier
//
//        .fillMaxWidth()
//        .padding(top = 500.dp)
//        .padding(bottom = 70.dp)
//
//        ,
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//
//        ){
//        Row(
//        modifier = Modifier
//
//        .fillMaxWidth().padding(start = 40.dp),
//
//        ){
//        val icon = painterResource(id = R.drawable.ic_baseline_local_phone_24)
//        Icon(painter = icon, contentDescription = null, modifier = Modifier.padding(start = 60.dp), Color(0xFF3ddc84)
//        )
//        Text(text = stringResource(R.string.phone_number), modifier = Modifier.padding(start = 25.dp),color = Color.White)
//
//        }
//        Row(
//        modifier = Modifier
//
//        .fillMaxWidth().padding(start = 40.dp),
//        ){
//        val icon2 = painterResource(id = R.drawable.ic_baseline_email_24)
//        Icon(painter = icon2, contentDescription = null,  modifier = Modifier.padding(start = 60.dp),Color(0xFF3ddc84))
//        Text(text = stringResource(R.string.email_text), modifier = Modifier.padding(start = 25.dp),color = Color.White)
//        }
//        Row(
//        modifier = Modifier
//
//        .fillMaxWidth().padding(start = 40.dp),
//        ){
//        val icon3 = painterResource(id = R.drawable.ic_baseline_share_24)
//        Icon(painter = icon3, contentDescription = null, modifier = Modifier.padding(start = 60.dp),Color(0xFF3ddc84) )
//        Text(text = stringResource(R.string.share_text), modifier = Modifier.padding(start = 25.dp),color = Color.White)
//        }
//        }
//        }
//
//@Preview(showBackground = true)
//@Composable
//fun BusinessCardPreview() {
//        BusinessCardTheme {
//        Surface{
//        BusinessCard()
//        }
//
//        }
//        }