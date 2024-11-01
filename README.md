# YoElement

YoElement is a simple Jetpack Compose library that allows you to create component with more  
simple way.

Without YoElement

    Button(onClick = { /*TODO*/ }, modifier = Modifier) {  
	  Text(text = "Button")  
	}
With YoElement

    YButton( 
	    onClick = { /*TODO*/ } 
	    text = "YButton",  
	    modifier = Modifier.fillMaxWidth()
    )
