package com.yalla.yalla.model.room;

import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.yalla.yalla.model.bean.AbsJavaBean;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p028Oooo0oO.o0O00o0;

/* JADX INFO: loaded from: classes4.dex */
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
    public String websocketaddr;
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

    @Override // com.yalla.yalla.model.bean.AbsJavaBean
    public String toString() {
        StringBuilder sb = new StringBuilder("RoomModel{name='");
        sb.append(this.name);
        sb.append("', image='");
        sb.append(this.image);
        sb.append("', id=");
        sb.append(this.id);
        sb.append(", roomIpList=");
        sb.append(this.roomIpList.toString());
        sb.append(", level='");
        sb.append(this.level);
        sb.append("', heatnow='");
        sb.append(this.heatnow);
        sb.append("', kinds=");
        sb.append(this.kinds);
        sb.append(", isencrypt='");
        sb.append(this.isencrypt);
        sb.append("', baridx='");
        sb.append(this.baridx);
        sb.append("', password='");
        return o0O00o0.OooO0O0(sb, this.password, "'}");
    }
}
