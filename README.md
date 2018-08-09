# DeepLinking
Android Deeplinking (opening from web ) demo project 



# How to use 

```

  <intent-filter android:label="Deep Linking">
                <action android:name="android.intent.action.VIEW" />
                <category android:name="android.intent.category.DEFAULT" />
                <category android:name="android.intent.category.BROWSABLE" />
                 <data android:scheme="wisdomrider"
                    android:host="deeplink" />
            </intent-filter>
```




just add this to android manifest and see

here in the data scheme wisdomrider is main link and deep linking is host so here if you call
# wisdomrider://deeplink 

the activity will be called. you can change it too anything
