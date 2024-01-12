package com.example.bikee_cataloguemobileapp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u00100\u001a\u0002012\u0006\u00102\u001a\u00020\n2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000204H\u0002J\u0018\u00106\u001a\u0002012\u0006\u00107\u001a\u0002082\u0006\u00106\u001a\u00020\nH\u0002J\u0012\u00109\u001a\u0002012\b\u0010:\u001a\u0004\u0018\u00010;H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R\u001a\u0010!\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\u001a\u0010$\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017R\u001a\u0010\'\u001a\u00020(X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020(X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,\u00a8\u0006<"}, d2 = {"Lcom/example/bikee_cataloguemobileapp/AdminaddBike;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "btnaddbike", "Landroid/widget/Button;", "getBtnaddbike", "()Landroid/widget/Button;", "setBtnaddbike", "(Landroid/widget/Button;)V", "encoder", "", "getEncoder", "()Ljava/lang/String;", "setEncoder", "(Ljava/lang/String;)V", "enoded", "getEnoded", "setEnoded", "etcolorbike", "Landroid/widget/EditText;", "getEtcolorbike", "()Landroid/widget/EditText;", "setEtcolorbike", "(Landroid/widget/EditText;)V", "etdesscribike", "getEtdesscribike", "setEtdesscribike", "etlinkbike", "getEtlinkbike", "setEtlinkbike", "etnamebike", "getEtnamebike", "setEtnamebike", "etpricebike", "getEtpricebike", "setEtpricebike", "etyoutubelink", "getEtyoutubelink", "setEtyoutubelink", "imageView1", "Landroid/widget/ImageView;", "getImageView1", "()Landroid/widget/ImageView;", "setImageView1", "(Landroid/widget/ImageView;)V", "imageView2", "getImageView2", "setImageView2", "generateQRCode", "", "link", "i", "", "i1", "message", "it", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class AdminaddBike extends androidx.appcompat.app.AppCompatActivity {
    public android.widget.ImageView imageView2;
    public android.widget.ImageView imageView1;
    public android.widget.EditText etnamebike;
    public android.widget.EditText etcolorbike;
    public android.widget.EditText etdesscribike;
    public android.widget.EditText etpricebike;
    public android.widget.EditText etlinkbike;
    public android.widget.EditText etyoutubelink;
    public android.widget.Button btnaddbike;
    @org.jetbrains.annotations.NotNull
    private java.lang.String enoded = "";
    @org.jetbrains.annotations.NotNull
    private java.lang.String encoder = "";
    
    public AdminaddBike() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.ImageView getImageView2() {
        return null;
    }
    
    public final void setImageView2(@org.jetbrains.annotations.NotNull
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.ImageView getImageView1() {
        return null;
    }
    
    public final void setImageView1(@org.jetbrains.annotations.NotNull
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.EditText getEtnamebike() {
        return null;
    }
    
    public final void setEtnamebike(@org.jetbrains.annotations.NotNull
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.EditText getEtcolorbike() {
        return null;
    }
    
    public final void setEtcolorbike(@org.jetbrains.annotations.NotNull
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.EditText getEtdesscribike() {
        return null;
    }
    
    public final void setEtdesscribike(@org.jetbrains.annotations.NotNull
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.EditText getEtpricebike() {
        return null;
    }
    
    public final void setEtpricebike(@org.jetbrains.annotations.NotNull
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.EditText getEtlinkbike() {
        return null;
    }
    
    public final void setEtlinkbike(@org.jetbrains.annotations.NotNull
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.EditText getEtyoutubelink() {
        return null;
    }
    
    public final void setEtyoutubelink(@org.jetbrains.annotations.NotNull
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.Button getBtnaddbike() {
        return null;
    }
    
    public final void setBtnaddbike(@org.jetbrains.annotations.NotNull
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEnoded() {
        return null;
    }
    
    public final void setEnoded(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEncoder() {
        return null;
    }
    
    public final void setEncoder(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void generateQRCode(java.lang.String link, int i, int i1) {
    }
    
    private final void message(android.view.View it, java.lang.String message) {
    }
}