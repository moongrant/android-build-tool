package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class Oooo000 extends CrashlyticsReport.OooO.OooO0o.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0 f20091OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final p287o0O0Oo0.OooOO0<CrashlyticsReport.OooO0OO> f20092OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final p287o0O0Oo0.OooOO0<CrashlyticsReport.OooO0OO> f20093OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Boolean f20094OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f20095OooO0o0;

    public static final class OooO00o extends CrashlyticsReport.OooO.OooO0o.OooO00o.AbstractC0245OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0 f20096OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public p287o0O0Oo0.OooOO0<CrashlyticsReport.OooO0OO> f20097OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public p287o0O0Oo0.OooOO0<CrashlyticsReport.OooO0OO> f20098OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Boolean f20099OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Integer f20100OooO0o0;

        public OooO00o(CrashlyticsReport.OooO.OooO0o.OooO00o oooO00o) {
            this.f20096OooO00o = oooO00o.OooO0OO();
            this.f20097OooO0O0 = oooO00o.OooO0O0();
            this.f20098OooO0OO = oooO00o.OooO0Oo();
            this.f20099OooO0Oo = oooO00o.OooO00o();
            this.f20100OooO0o0 = Integer.valueOf(oooO00o.OooO0o0());
        }

        public final Oooo000 OooO00o() {
            String strConcat = this.f20096OooO00o == null ? " execution" : "";
            if (this.f20100OooO0o0 == null) {
                strConcat = strConcat.concat(" uiOrientation");
            }
            if (strConcat.isEmpty()) {
                return new Oooo000(this.f20096OooO00o, this.f20097OooO0O0, this.f20098OooO0OO, this.f20099OooO0Oo, this.f20100OooO0o0.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }
    }

    public Oooo000() {
        throw null;
    }

    public Oooo000(CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0 oooO0O0, p287o0O0Oo0.OooOO0 oooOO1, p287o0O0Oo0.OooOO0 oooOO2, Boolean bool, int i) {
        this.f20091OooO00o = oooO0O0;
        this.f20092OooO0O0 = oooOO1;
        this.f20093OooO0OO = oooOO2;
        this.f20094OooO0Oo = bool;
        this.f20095OooO0o0 = i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o
    @Nullable
    public final Boolean OooO00o() {
        return this.f20094OooO0Oo;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o
    @Nullable
    public final p287o0O0Oo0.OooOO0<CrashlyticsReport.OooO0OO> OooO0O0() {
        return this.f20092OooO0O0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o
    @NonNull
    public final CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0 OooO0OO() {
        return this.f20091OooO00o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o
    @Nullable
    public final p287o0O0Oo0.OooOO0<CrashlyticsReport.OooO0OO> OooO0Oo() {
        return this.f20093OooO0OO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o
    public final OooO00o OooO0o() {
        return new OooO00o(this);
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o
    public final int OooO0o0() {
        return this.f20095OooO0o0;
    }

    public final boolean equals(Object obj) {
        p287o0O0Oo0.OooOO0<CrashlyticsReport.OooO0OO> oooOO1;
        p287o0O0Oo0.OooOO0<CrashlyticsReport.OooO0OO> oooOO2;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.OooO.OooO0o.OooO00o)) {
            return false;
        }
        CrashlyticsReport.OooO.OooO0o.OooO00o oooO00o = (CrashlyticsReport.OooO.OooO0o.OooO00o) obj;
        return this.f20091OooO00o.equals(oooO00o.OooO0OO()) && ((oooOO1 = this.f20092OooO0O0) != null ? oooOO1.equals(oooO00o.OooO0O0()) : oooO00o.OooO0O0() == null) && ((oooOO2 = this.f20093OooO0OO) != null ? oooOO2.equals(oooO00o.OooO0Oo()) : oooO00o.OooO0Oo() == null) && ((bool = this.f20094OooO0Oo) != null ? bool.equals(oooO00o.OooO00o()) : oooO00o.OooO00o() == null) && this.f20095OooO0o0 == oooO00o.OooO0o0();
    }

    public final int hashCode() {
        int iHashCode = (this.f20091OooO00o.hashCode() ^ 1000003) * 1000003;
        p287o0O0Oo0.OooOO0<CrashlyticsReport.OooO0OO> oooOO1 = this.f20092OooO0O0;
        int iHashCode2 = (iHashCode ^ (oooOO1 == null ? 0 : oooOO1.hashCode())) * 1000003;
        p287o0O0Oo0.OooOO0<CrashlyticsReport.OooO0OO> oooOO2 = this.f20093OooO0OO;
        int iHashCode3 = (iHashCode2 ^ (oooOO2 == null ? 0 : oooOO2.hashCode())) * 1000003;
        Boolean bool = this.f20094OooO0Oo;
        return ((iHashCode3 ^ (bool != null ? bool.hashCode() : 0)) * 1000003) ^ this.f20095OooO0o0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.f20091OooO00o);
        sb.append(", customAttributes=");
        sb.append(this.f20092OooO0O0);
        sb.append(", internalKeys=");
        sb.append(this.f20093OooO0OO);
        sb.append(", background=");
        sb.append(this.f20094OooO0Oo);
        sb.append(", uiOrientation=");
        return p022Oooo00O.OooOO0.OooO0O0(sb, this.f20095OooO0o0, "}");
    }
}
