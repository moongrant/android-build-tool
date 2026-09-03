package com.app.base.model;

import com.facebook.appevents.AppEventsConstants;

/* JADX INFO: loaded from: classes.dex */
public class SignInModel {

    /* JADX INFO: renamed from: code, reason: collision with root package name */
    public String f11887code;
    public DataBean data;
    public String message;

    public static class DataBean {
        public long balance;
        public long changeCrystal;
        public long changecoin;
        public long crystalBalance;
        public String ispopup = AppEventsConstants.EVENT_PARAM_VALUE_NO;
    }
}
