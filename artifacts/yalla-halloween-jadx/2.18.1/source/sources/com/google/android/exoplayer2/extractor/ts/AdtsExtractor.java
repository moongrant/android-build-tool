package com.google.android.exoplayer2.extractor.ts;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.extractor.Extractor;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p296o0O0OoO0.o0OO00O;
import p296o0O0OoO0.oo0o0Oo;
import p318o0O0oOo.o000;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o0000OO0;

/* JADX INFO: loaded from: classes2.dex */
public final class AdtsExtractor implements Extractor {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f14029OooO;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000 f14032OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0000OO0 f14033OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f14034OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public p296o0O0OoO0.o0OoOo0 f14035OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f14037OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO f14030OooO00o = new OooO(true, null);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000 f14031OooO0O0 = new o000(RecyclerView.oo0o0Oo.FLAG_MOVED);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f14036OooO0oO = -1;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public AdtsExtractor() {
        o000 o000Var = new o000(10);
        this.f14032OooO0OO = o000Var;
        byte[] bArr = o000Var.f36661OooO00o;
        this.f14033OooO0Oo = new o0000OO0(bArr, bArr.length);
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO(p296o0O0OoO0.o0OoOo0 o0oooo1) {
        this.f14035OooO0o0 = o0oooo1;
        this.f14030OooO00o.OooO0o0(o0oooo1, new TsPayloadReader.OooO0o(0, 1));
        o0oooo1.OooOOO0();
    }

    public final int OooO00o(p296o0O0OoO0.o000oOoO o000oooo2) throws IOException {
        p296o0O0OoO0.Oooo000 oooo000;
        int i = 0;
        while (true) {
            oooo000 = (p296o0O0OoO0.Oooo000) o000oooo2;
            oooo000.OooO0OO(this.f14032OooO0OO.f36661OooO00o, 0, 10, false);
            this.f14032OooO0OO.OooOoOO(0);
            if (this.f14032OooO0OO.OooOOoo() != 4801587) {
                break;
            }
            this.f14032OooO0OO.OooOoo0(3);
            int iOooOOOo = this.f14032OooO0OO.OooOOOo();
            i += iOooOOOo + 10;
            oooo000.OooOOOO(iOooOOOo, false);
        }
        oooo000.f35895OooO0o = 0;
        oooo000.OooOOOO(i, false);
        if (this.f14036OooO0oO == -1) {
            this.f14036OooO0oO = i;
        }
        return i;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO0Oo(long j, long j2) {
        this.f14037OooO0oo = false;
        this.f14030OooO00o.OooO0O0();
        this.f14034OooO0o = j2;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean OooO0o(p296o0O0OoO0.o000oOoO o000oooo2) throws IOException {
        p296o0O0OoO0.Oooo000 oooo000;
        int iOooO00o = OooO00o(o000oooo2);
        int i = iOooO00o;
        while (true) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                oooo000 = (p296o0O0OoO0.Oooo000) o000oooo2;
                oooo000.OooO0OO(this.f14032OooO0OO.f36661OooO00o, 0, 2, false);
                this.f14032OooO0OO.OooOoOO(0);
                if (!OooO.OooO0oO(this.f14032OooO0OO.OooOo0O())) {
                    break;
                }
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                oooo000.OooO0OO(this.f14032OooO0OO.f36661OooO00o, 0, 4, false);
                this.f14033OooO0Oo.OooOO0O(14);
                int iOooO0oO = this.f14033OooO0Oo.OooO0oO(13);
                if (iOooO0oO <= 6) {
                    return false;
                }
                oooo000.OooOOOO(iOooO0oO - 6, false);
                i3 += iOooO0oO;
            }
            oooo000.f35895OooO0o = 0;
            i++;
            if (i - iOooO00o >= 8192) {
                return false;
            }
            oooo000.OooOOOO(i, false);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int OooO0o0(p296o0O0OoO0.o000oOoO o000oooo2, o0OO00O o0oo00o2) throws IOException {
        o00000O0.OooO0o(this.f14035OooO0o0);
        o000oooo2.OooO00o();
        int i = o000oooo2.read(this.f14031OooO0O0.f36661OooO00o, 0, RecyclerView.oo0o0Oo.FLAG_MOVED);
        boolean z = i == -1;
        if (!this.f14029OooO) {
            this.f14035OooO0o0.OooOO0O(new oo0o0Oo.OooO0O0(-9223372036854775807L));
            this.f14029OooO = true;
        }
        if (z) {
            return -1;
        }
        this.f14031OooO0O0.OooOoOO(0);
        this.f14031OooO0O0.OooOoO(i);
        if (!this.f14037OooO0oo) {
            this.f14030OooO00o.f14059OooOOoo = this.f14034OooO0o;
            this.f14037OooO0oo = true;
        }
        this.f14030OooO00o.OooO00o(this.f14031OooO0O0);
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }
}
