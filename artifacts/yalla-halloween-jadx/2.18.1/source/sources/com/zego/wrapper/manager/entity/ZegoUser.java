package com.zego.wrapper.manager.entity;

import OooO00o.OooO00o;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ZegoUser implements Cloneable {
    private static final String TAG = "ZegoUser";
    private static final String ZEGO_USER_ID_KEY = "i";
    private static final String ZEGO_USER_NAME_KEY = "n";
    public String userID;
    public String userName;

    @Nullable
    public static ZegoUser userFromJsonObject(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            ZegoUser zegoUser = new ZegoUser();
            zegoUser.userID = jSONObject.getString("i");
            zegoUser.userName = jSONObject.getString(ZEGO_USER_NAME_KEY);
            return zegoUser;
        } catch (JSONException e) {
            String str = TAG;
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("zegoUserFromJsonObject ");
            sbOooO0o0.append(e.getMessage());
            Log.e(str, sbOooO0o0.toString());
            return null;
        }
    }

    public static ZegoUser userWithUID(long j) {
        String strValueOf = String.valueOf(j);
        ZegoUser zegoUser = new ZegoUser();
        zegoUser.userID = strValueOf;
        zegoUser.userName = strValueOf;
        return zegoUser;
    }

    public boolean equals(Object obj) {
        return isValid() && (obj instanceof ZegoUser) && hashCode() == obj.hashCode();
    }

    public int hashCode() {
        if (isValid()) {
            return this.userID.hashCode();
        }
        return -1;
    }

    public boolean isValid() {
        return (TextUtils.isEmpty(this.userID) || TextUtils.isEmpty(this.userName)) ? false : true;
    }

    @Nullable
    public JSONObject jsonObject() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("i", this.userID);
            jSONObject.put(ZEGO_USER_NAME_KEY, this.userName);
            return jSONObject;
        } catch (JSONException e) {
            String str = TAG;
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("jsonObject ");
            sbOooO0o0.append(e.getMessage());
            Log.e(str, sbOooO0o0.toString());
            return null;
        }
    }

    public com.zego.zegoliveroom.entity.ZegoUser toInnerZegoUser() {
        com.zego.zegoliveroom.entity.ZegoUser zegoUser = new com.zego.zegoliveroom.entity.ZegoUser();
        zegoUser.userID = this.userID;
        zegoUser.userName = this.userName;
        return zegoUser;
    }

    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("ZegoUser{userID='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.userID, '\'', ", userName='");
        return kotlin.reflect.jvm.internal.impl.builtins.OooO00o.OooO00o(sbOooO0o0, this.userName, '\'', '}');
    }

    public int uid() {
        return Integer.parseInt(this.userID);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public ZegoUser m497clone() {
        try {
            return (ZegoUser) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new IllegalStateException("CloneNotSupportedException ??");
        }
    }
}
