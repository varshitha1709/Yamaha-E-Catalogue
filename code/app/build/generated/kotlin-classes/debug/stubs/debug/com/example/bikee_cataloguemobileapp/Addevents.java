package com.example.bikee_cataloguemobileapp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\"\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002032\b\u00105\u001a\u0004\u0018\u000106H\u0014J\u0012\u00107\u001a\u0002012\b\u00108\u001a\u0004\u0018\u000109H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u001a\u0010!\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR\u001a\u0010$\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001b\"\u0004\b&\u0010\u001dR\u001a\u0010\'\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dR\u001a\u0010*\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001b\"\u0004\b,\u0010\u001dR\u001a\u0010-\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001b\"\u0004\b/\u0010\u001d\u00a8\u0006:"}, d2 = {"Lcom/example/bikee_cataloguemobileapp/Addevents;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "AM_PM", "", "getAM_PM", "()Ljava/lang/String;", "setAM_PM", "(Ljava/lang/String;)V", "addimg", "Landroid/widget/ImageView;", "getAddimg", "()Landroid/widget/ImageView;", "setAddimg", "(Landroid/widget/ImageView;)V", "btnadd", "Landroid/widget/Button;", "getBtnadd", "()Landroid/widget/Button;", "setBtnadd", "(Landroid/widget/Button;)V", "encode", "getEncode", "setEncode", "etcity", "Landroid/widget/EditText;", "getEtcity", "()Landroid/widget/EditText;", "setEtcity", "(Landroid/widget/EditText;)V", "etedec", "getEtedec", "setEtedec", "eteguest", "getEteguest", "setEteguest", "etename", "getEtename", "setEtename", "etend", "getEtend", "setEtend", "eteplace", "getEteplace", "setEteplace", "etestart", "getEtestart", "setEtestart", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class Addevents extends androidx.appcompat.app.AppCompatActivity {
    public android.widget.EditText etename;
    public android.widget.EditText eteguest;
    public android.widget.EditText etestart;
    public android.widget.EditText etend;
    public android.widget.EditText eteplace;
    public android.widget.EditText etedec;
    public android.widget.EditText etcity;
    public android.widget.Button btnadd;
    public android.widget.ImageView addimg;
    @org.jetbrains.annotations.NotNull
    private java.lang.String encode = "";
    @org.jetbrains.annotations.NotNull
    private java.lang.String AM_PM = "";
    
    public Addevents() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.EditText getEtename() {
        return null;
    }
    
    public final void setEtename(@org.jetbrains.annotations.NotNull
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.EditText getEteguest() {
        return null;
    }
    
    public final void setEteguest(@org.jetbrains.annotations.NotNull
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.EditText getEtestart() {
        return null;
    }
    
    public final void setEtestart(@org.jetbrains.annotations.NotNull
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.EditText getEtend() {
        return null;
    }
    
    public final void setEtend(@org.jetbrains.annotations.NotNull
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.EditText getEteplace() {
        return null;
    }
    
    public final void setEteplace(@org.jetbrains.annotations.NotNull
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.EditText getEtedec() {
        return null;
    }
    
    public final void setEtedec(@org.jetbrains.annotations.NotNull
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.EditText getEtcity() {
        return null;
    }
    
    public final void setEtcity(@org.jetbrains.annotations.NotNull
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.Button getBtnadd() {
        return null;
    }
    
    public final void setBtnadd(@org.jetbrains.annotations.NotNull
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.ImageView getAddimg() {
        return null;
    }
    
    public final void setAddimg(@org.jetbrains.annotations.NotNull
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEncode() {
        return null;
    }
    
    public final void setEncode(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAM_PM() {
        return null;
    }
    
    public final void setAM_PM(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable
    android.content.Intent data) {
    }
}