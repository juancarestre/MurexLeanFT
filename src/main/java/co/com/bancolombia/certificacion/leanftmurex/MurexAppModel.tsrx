<?xml version="1.0" encoding="utf-8" standalone="yes"?>
<applicationModel>
    <name>Application Model</name>
    <className>MurexAppModel</className>
    <objects>
        <object type="Window" technology="Java">
            <name>MX.3 - QA3</name>
            <codeName>inQA3</codeName>
            <identification>
                <properties>
                    <property name="Title" type="string" isRegExp="false">MX.3 - QA3</property>
                </properties>
            </identification>
            <children>
                <object type="Editor" technology="Java">
                    <name>UsernameEditor</name>
                    <codeName>UsernameEditor</codeName>
                    <identification>
                        <properties>
                            <property name="NativeClass" type="string" isRegExp="false">javax.swing.JTextField</property>
                        </properties>
                    </identification>
                </object>
                <object type="Editor" technology="Java">
                    <name>PasswordEditor</name>
                    <codeName>PasswordEditor</codeName>
                    <identification>
                        <properties>
                            <property name="NativeClass" type="string" isRegExp="false">murex.ui.components.fields.text.MSecretField</property>
                        </properties>
                    </identification>
                </object>
                <object type="Button" technology="Java">
                    <name>SignInButton</name>
                    <codeName>SignInButton</codeName>
                    <identification>
                        <properties>
                            <property name="Label" type="string" isRegExp="false">Sign in</property>
                        </properties>
                    </identification>
                </object>
            </children>
        </object>
        <object type="Window" technology="Standard Windows">
            <name>Window</name>
            <codeName>InitialWindow</codeName>
            <identification>
                <properties>
                    <property name="IsOwnedWindow" type="boolean" isRegExp="false">false</property>
                    <property name="IsChildWindow" type="boolean" isRegExp="false">false</property>
                    <property name="WindowClassRegExp" type="string" isRegExp="false">JavaSplash</property>
                </properties>
            </identification>
        </object>
    </objects>
</applicationModel>
