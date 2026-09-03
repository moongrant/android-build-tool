package com.app.base.model;

import OooO00o.OooO00o;
import android.text.TextUtils;
import com.app.base.bean.AbsJavaBean;
import com.facebook.appevents.AppEventsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class RoomModel extends AbsJavaBean {
    private String baridx;
    private long id;
    private String image;
    private int kinds;
    private String level;
    private String name;
    private String password;
    private String roomIp;
    private String sessionId;
    private List<String> roomIpList = new ArrayList();
    private String heatnow = AppEventsConstants.EVENT_PARAM_VALUE_NO;
    private String isencrypt = "";

    public String getBaridx() {
        return this.baridx;
    }

    public String getHeatDay() {
        return this.heatnow;
    }

    public long getId() {
        return this.id;
    }

    public String getImage() {
        return this.image;
    }

    public String getIsencrypt() {
        return this.isencrypt;
    }

    public int getKinds() {
        return this.kinds;
    }

    public String getLevel() {
        return this.level;
    }

    public String getName() {
        return this.name;
    }

    public String getPassword() {
        return this.password;
    }

    public String getRoomIp() {
        return this.roomIp;
    }

    public List<String> getRoomIpList() {
        return this.roomIpList;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public void setBaridx(String str) {
        this.baridx = str;
    }

    public void setHeatDay(String str) {
        this.heatnow = str;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setImage(String str) {
        this.image = str;
    }

    public void setIsencrypt(String str) {
        this.isencrypt = str;
    }

    public void setKinds(int i) {
        this.kinds = i;
    }

    public void setLevel(String str) {
        this.level = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public void setRoomIp(String str) {
        this.roomIp = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.roomIpList = Arrays.asList(str.split(";"));
    }

    public void setSessionId(String str) {
        this.sessionId = str;
    }

    @Override // com.app.base.bean.AbsJavaBean
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("RoomModel{name='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.name, '\'', ", image='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.image, '\'', ", id=");
        sbOooO0o0.append(this.id);
        sbOooO0o0.append(", roomIpList=");
        sbOooO0o0.append(this.roomIpList.toString());
        sbOooO0o0.append(", level='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.level, '\'', ", heatnow='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.heatnow, '\'', ", kinds=");
        sbOooO0o0.append(this.kinds);
        sbOooO0o0.append(", isencrypt='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.isencrypt, '\'', ", baridx='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.baridx, '\'', ", password='");
        return kotlin.reflect.jvm.internal.impl.builtins.OooO00o.OooO00o(sbOooO0o0, this.password, '\'', '}');
    }
}
