package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class Oooo000 extends CrashlyticsReport.OooO.OooO0o.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0 f19619OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final p291o0O0Oo0o.o00O0O<CrashlyticsReport.OooO0OO> f19620OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final p291o0O0Oo0o.o00O0O<CrashlyticsReport.OooO0OO> f19621OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Boolean f19622OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f19623OooO0o0;

    public static final class OooO00o extends CrashlyticsReport.OooO.OooO0o.OooO00o.AbstractC0244OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0 f19624OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public p291o0O0Oo0o.o00O0O<CrashlyticsReport.OooO0OO> f19625OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public p291o0O0Oo0o.o00O0O<CrashlyticsReport.OooO0OO> f19626OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Boolean f19627OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Integer f19628OooO0o0;

        public OooO00o(CrashlyticsReport.OooO.OooO0o.OooO00o oooO00o) {
            this.f19624OooO00o = oooO00o.OooO0OO();
            this.f19625OooO0O0 = oooO00o.OooO0O0();
            this.f19626OooO0OO = oooO00o.OooO0Oo();
            this.f19627OooO0Oo = oooO00o.OooO00o();
            this.f19628OooO0o0 = Integer.valueOf(oooO00o.OooO0o0());
        }

        public final Oooo000 OooO00o() {
            String strConcat = this.f19624OooO00o == null ? " execution" : "";
            if (this.f19628OooO0o0 == null) {
                strConcat = strConcat.concat(" uiOrientation");
            }
            if (strConcat.isEmpty()) {
                return new Oooo000(this.f19624OooO00o, this.f19625OooO0O0, this.f19626OooO0OO, this.f19627OooO0Oo, this.f19628OooO0o0.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }
    }

    public Oooo000() {
        throw null;
    }

    public Oooo000(CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0 oooO0O0, p291o0O0Oo0o.o00O0O o00o0o2, p291o0O0Oo0o.o00O0O o00o0o3, Boolean bool, int i) {
        this.f19619OooO00o = oooO0O0;
        this.f19620OooO0O0 = o00o0o2;
        this.f19621OooO0OO = o00o0o3;
        this.f19622OooO0Oo = bool;
        this.f19623OooO0o0 = i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o
    @Nullable
    public final Boolean OooO00o() {
        return this.f19622OooO0Oo;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o
    @Nullable
    public final p291o0O0Oo0o.o00O0O<CrashlyticsReport.OooO0OO> OooO0O0() {
        return this.f19620OooO0O0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o
    @NonNull
    public final CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0 OooO0OO() {
        return this.f19619OooO00o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o
    @Nullable
    public final p291o0O0Oo0o.o00O0O<CrashlyticsReport.OooO0OO> OooO0Oo() {
        return this.f19621OooO0OO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o
    public final OooO00o OooO0o() {
        return new OooO00o(this);
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o
    public final int OooO0o0() {
        return this.f19623OooO0o0;
    }

    public final boolean equals(Object obj) {
        p291o0O0Oo0o.o00O0O<CrashlyticsReport.OooO0OO> o00o0o2;
        p291o0O0Oo0o.o00O0O<CrashlyticsReport.OooO0OO> o00o0o3;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.OooO.OooO0o.OooO00o)) {
            return false;
        }
        CrashlyticsReport.OooO.OooO0o.OooO00o oooO00o = (CrashlyticsReport.OooO.OooO0o.OooO00o) obj;
        return this.f19619OooO00o.equals(oooO00o.OooO0OO()) && ((o00o0o2 = this.f19620OooO0O0) != null ? o00o0o2.equals(oooO00o.OooO0O0()) : oooO00o.OooO0O0() == null) && ((o00o0o3 = this.f19621OooO0OO) != null ? o00o0o3.equals(oooO00o.OooO0Oo()) : oooO00o.OooO0Oo() == null) && ((bool = this.f19622OooO0Oo) != null ? bool.equals(oooO00o.OooO00o()) : oooO00o.OooO00o() == null) && this.f19623OooO0o0 == oooO00o.OooO0o0();
    }

    public final int hashCode() {
        int iHashCode = (this.f19619OooO00o.hashCode() ^ 1000003) * 1000003;
        p291o0O0Oo0o.o00O0O<CrashlyticsReport.OooO0OO> o00o0o2 = this.f19620OooO0O0;
        int iHashCode2 = (iHashCode ^ (o00o0o2 == null ? 0 : o00o0o2.hashCode())) * 1000003;
        p291o0O0Oo0o.o00O0O<CrashlyticsReport.OooO0OO> o00o0o3 = this.f19621OooO0OO;
        int iHashCode3 = (iHashCode2 ^ (o00o0o3 == null ? 0 : o00o0o3.hashCode())) * 1000003;
        Boolean bool = this.f19622OooO0Oo;
        return ((iHashCode3 ^ (bool != null ? bool.hashCode() : 0)) * 1000003) ^ this.f19623OooO0o0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.f19619OooO00o);
        sb.append(", customAttributes=");
        sb.append(this.f19620OooO0O0);
        sb.append(", internalKeys=");
        sb.append(this.f19621OooO0OO);
        sb.append(", background=");
        sb.append(this.f19622OooO0Oo);
        sb.append(", uiOrientation=");
        return p022Oooo00O.OooOO0.OooO00o(sb, this.f19623OooO0o0, "}");
    }
}
