package com.yalla.yalla.data.constant;

import java.io.Serializable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/yalla/yalla/data/constant/ClientCodeType;", "", "Ljava/io/Serializable;", "", "source", "I", "OooO00o", "()I", "Login", "Register", "Retrieve", "BingingPhone", "ChangeOld", "Change", "UnbindThird", "DeleteAccount", "LoginVerification", "TurnOnProtection", "TunOnProtectionBingingPhone", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public enum ClientCodeType implements Serializable {
    Login(1),
    Register(2),
    Retrieve(-1),
    BingingPhone(3),
    ChangeOld(-1),
    Change(4),
    UnbindThird(-1),
    DeleteAccount(-1),
    LoginVerification(-1),
    TurnOnProtection(-1),
    TunOnProtectionBingingPhone(5);

    private final int source;

    ClientCodeType(int i) {
        this.source = i;
    }

    /* JADX INFO: renamed from: OooO00o, reason: from getter */
    public final int getSource() {
        return this.source;
    }
}
