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
                <object type="UiObject" technology="Java">
                    <name>GroupDetailsPanel</name>
                    <codeName>GroupDetailsPanelUiObject</codeName>
                    <identification>
                        <properties>
                            <property name="NativeClass" type="string" isRegExp="false">murex.gui.client.GroupDetailsPanel</property>
                        </properties>
                    </identification>
                </object>
                <object type="Label" technology="Java">
                    <name>BO(st)</name>
                    <codeName>BOStLabel</codeName>
                    <identification>
                        <properties>
                            <property name="Label" type="string" isRegExp="false">BO</property>
                        </properties>
                    </identification>
                </object>
                <object type="UiObject" technology="Java">
                    <name>JPanel</name>
                    <codeName>UserLoggedAs</codeName>
                    <identification>
                        <properties>
                            <property name="NativeClass" type="string" isRegExp="false">javax.swing.JPanel</property>
                        </properties>
                        <index>2</index>
                    </identification>
                </object>
                <object type="Editor" technology="Java">
                    <name>Ctrl-F</name>
                    <codeName>MurexSearchBar</codeName>
                    <identification>
                        <properties>
                            <property name="AttachedText" type="string" isRegExp="false">Ctrl-F</property>
                        </properties>
                    </identification>
                </object>
                <object type="UiObject" technology="Java">
                    <name>HomeScreen$1</name>
                    <codeName>HomeScreen1UiObject</codeName>
                    <identification>
                        <properties>
                            <property name="NativeClass" type="string" isRegExp="false">murex.gui.component.navigation.components.HomeScreen$1</property>
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
        <object type="Window" technology="Java">
            <name>QA3MX [PID:20757 NPID:39484 SID:1731676062] &lt;FO_TRD_BOG:USER1&gt;</name>
            <codeName>QA3MXPID20757NPID39484SID1731676062FOTRDBOGUSER1Window</codeName>
            <identification>
                <properties>
                    <property name="Title" type="string" isRegExp="false">QA3MX [PID:20757 NPID:39484 SID:1731676062] &lt;FO_TRD_BOG:USER1&gt;</property>
                </properties>
            </identification>
        </object>
    </objects>
</applicationModel>
