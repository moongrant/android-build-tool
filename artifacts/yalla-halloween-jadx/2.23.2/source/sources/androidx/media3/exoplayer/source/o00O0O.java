package androidx.media3.exoplayer.source;

import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.extractor.TrackOutput;
import java.io.EOFException;
import java.io.IOException;
import o000O.o0Oo0oo;
import o000O00O.o00O0000;
import org.jctools.util.Pow2;
import p069o0000ooO.o00000O0;
import p069o0000ooO.o0000oo;
import p080o000OoO.o00;
import p080o000OoO.o000O000;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class o00O0O implements TrackOutput {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OoOo0 f8043OooO00o;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final androidx.media3.exoplayer.drm.OooO0OO f8046OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public OooO0OO f8047OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final androidx.media3.exoplayer.drm.OooO0O0.OooO00o f8048OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public androidx.media3.common.OooOO0 f8049OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public DrmSession f8050OooO0oo;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f8057OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f8058OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f8059OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f8060OooOOoo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f8065OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @Nullable
    public androidx.media3.common.OooOO0 f8066OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f8068OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f8069OooOoo0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f8044OooO0O0 = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f8042OooO = 1000;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public long[] f8051OooOO0 = new long[1000];

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long[] f8052OooOO0O = new long[1000];

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public long[] f8054OooOOO = new long[1000];

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int[] f8055OooOOO0 = new int[1000];

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int[] f8053OooOO0o = new int[1000];

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public TrackOutput.OooO00o[] f8056OooOOOO = new TrackOutput.OooO00o[1000];

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0Oo0oo<OooO0O0> f8045OooO0OO = new o0Oo0oo<>(new o000O.o0ooOOo());

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public long f8063OooOo00 = Long.MIN_VALUE;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public long f8062OooOo0 = Long.MIN_VALUE;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public long f8064OooOo0O = Long.MIN_VALUE;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f8067OooOoO0 = true;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f8061OooOo = true;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f8070OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public long f8071OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public TrackOutput.OooO00o f8072OooO0OO;
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final androidx.media3.common.OooOO0 f8073OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final androidx.media3.exoplayer.drm.OooO0OO.OooO0O0 f8074OooO0O0;

        public OooO0O0(androidx.media3.common.OooOO0 oooOO1, androidx.media3.exoplayer.drm.OooO0OO.OooO0O0 oooO0O0) {
            this.f8073OooO00o = oooOO1;
            this.f8074OooO0O0 = oooO0O0;
        }
    }

    public interface OooO0OO {
    }

    public o00O0O(p074o000OO0o.o00Oo0 o00oo1, @Nullable androidx.media3.exoplayer.drm.OooO0OO oooO0OO, @Nullable androidx.media3.exoplayer.drm.OooO0O0.OooO00o oooO00o) {
        this.f8046OooO0Oo = oooO0OO;
        this.f8048OooO0o0 = oooO00o;
        this.f8043OooO00o = new o0OoOo0(o00oo1);
    }

    public final synchronized long OooO() {
        return this.f8064OooOo0O;
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final int OooO00o(o00000O0 o00000o1, int i, boolean z) {
        return OooOOo(o00000o1, i, z);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004b A[Catch: all -> 0x006d, TryCatch #0 {, blocks: (B:4:0x0002, B:8:0x000e, B:13:0x001e, B:15:0x0036, B:17:0x004d, B:16:0x004b), top: B:28:0x0002 }] */
    @Override // androidx.media3.extractor.TrackOutput
    public final void OooO0O0(androidx.media3.common.OooOO0 oooOO1) {
        boolean z;
        synchronized (this) {
            z = false;
            this.f8067OooOoO0 = false;
            if (!o00.OooO00o(oooOO1, this.f8066OooOoO)) {
                if (this.f8045OooO0OO.f33882OooO0O0.size() == 0) {
                    this.f8066OooOoO = oooOO1;
                } else {
                    SparseArray<OooO0O0> sparseArray = this.f8045OooO0OO.f33882OooO0O0;
                    if (sparseArray.valueAt(sparseArray.size() - 1).f8073OooO00o.equals(oooOO1)) {
                        SparseArray<OooO0O0> sparseArray2 = this.f8045OooO0OO.f33882OooO0O0;
                        this.f8066OooOoO = sparseArray2.valueAt(sparseArray2.size() - 1).f8073OooO00o;
                    } else {
                        this.f8066OooOoO = oooOO1;
                    }
                }
                androidx.media3.common.OooOO0 oooOO2 = this.f8066OooOoO;
                this.f8068OooOoOO = o0000oo.OooO00o(oooOO2.f6412OooOOOO, oooOO2.f6409OooOO0o);
                this.f8069OooOoo0 = false;
                z = true;
            }
        }
        OooO0OO oooO0OO = this.f8047OooO0o;
        if (oooO0OO == null || !z) {
            return;
        }
        Oooo0 oooo0 = (Oooo0) oooO0OO;
        oooo0.f7979OooOOoo.post(oooo0.f7978OooOOo0);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final void OooO0OO(int i, o000O000 o000o001) {
        OooO0Oo(i, o000o001);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final void OooO0Oo(int i, o000O000 o000o001) {
        while (true) {
            o0OoOo0 o0oooo1 = this.f8043OooO00o;
            if (i <= 0) {
                o0oooo1.getClass();
                return;
            }
            int iOooO0O0 = o0oooo1.OooO0O0(i);
            o0OoOo0.OooO00o oooO00o = o0oooo1.f8092OooO0o;
            p074o000OO0o.o00O0O o00o0o2 = oooO00o.f8097OooO0OO;
            o000o001.OooO0Oo(((int) (o0oooo1.f8094OooO0oO - oooO00o.f8095OooO00o)) + o00o0o2.f34423OooO0O0, iOooO0O0, o00o0o2.f34422OooO00o);
            i -= iOooO0O0;
            long j = o0oooo1.f8094OooO0oO + ((long) iOooO0O0);
            o0oooo1.f8094OooO0oO = j;
            o0OoOo0.OooO00o oooO00o2 = o0oooo1.f8092OooO0o;
            if (j == oooO00o2.f8096OooO0O0) {
                o0oooo1.f8092OooO0o = oooO00o2.f8098OooO0Oo;
            }
        }
    }

    @GuardedBy("this")
    public final long OooO0o(int i) {
        this.f8062OooOo0 = Math.max(this.f8062OooOo0, OooOO0(i));
        this.f8057OooOOOo -= i;
        int i2 = this.f8059OooOOo0 + i;
        this.f8059OooOOo0 = i2;
        int i3 = this.f8058OooOOo + i;
        this.f8058OooOOo = i3;
        int i4 = this.f8042OooO;
        if (i3 >= i4) {
            this.f8058OooOOo = i3 - i4;
        }
        int i5 = this.f8060OooOOoo - i;
        this.f8060OooOOoo = i5;
        int i6 = 0;
        if (i5 < 0) {
            this.f8060OooOOoo = 0;
        }
        while (true) {
            o0Oo0oo<OooO0O0> o0oo0oo2 = this.f8045OooO0OO;
            SparseArray<OooO0O0> sparseArray = o0oo0oo2.f33882OooO0O0;
            if (i6 >= sparseArray.size() - 1) {
                break;
            }
            int i7 = i6 + 1;
            if (i2 < sparseArray.keyAt(i7)) {
                break;
            }
            o0oo0oo2.f33883OooO0OO.accept(sparseArray.valueAt(i6));
            sparseArray.removeAt(i6);
            int i8 = o0oo0oo2.f33881OooO00o;
            if (i8 > 0) {
                o0oo0oo2.f33881OooO00o = i8 - 1;
            }
            i6 = i7;
        }
        if (this.f8057OooOOOo != 0) {
            return this.f8052OooOO0O[this.f8058OooOOo];
        }
        int i9 = this.f8058OooOOo;
        if (i9 == 0) {
            i9 = this.f8042OooO;
        }
        int i10 = i9 - 1;
        return this.f8052OooOO0O[i10] + ((long) this.f8053OooOO0o[i10]);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0044  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c7 A[Catch: all -> 0x0199, TryCatch #0 {, blocks: (B:24:0x0051, B:26:0x0055, B:30:0x006b, B:31:0x006e, B:35:0x0076, B:41:0x00ae, B:64:0x0125, B:66:0x012e, B:43:0x00c7, B:45:0x00cb, B:47:0x00d6, B:49:0x00ed, B:53:0x00f6, B:54:0x00fb, B:56:0x0101, B:60:0x010f, B:62:0x0114, B:63:0x0122, B:46:0x00d4), top: B:72:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00cb A[Catch: all -> 0x0199, TryCatch #0 {, blocks: (B:24:0x0051, B:26:0x0055, B:30:0x006b, B:31:0x006e, B:35:0x0076, B:41:0x00ae, B:64:0x0125, B:66:0x012e, B:43:0x00c7, B:45:0x00cb, B:47:0x00d6, B:49:0x00ed, B:53:0x00f6, B:54:0x00fb, B:56:0x0101, B:60:0x010f, B:62:0x0114, B:63:0x0122, B:46:0x00d4), top: B:72:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d4 A[Catch: all -> 0x0199, TryCatch #0 {, blocks: (B:24:0x0051, B:26:0x0055, B:30:0x006b, B:31:0x006e, B:35:0x0076, B:41:0x00ae, B:64:0x0125, B:66:0x012e, B:43:0x00c7, B:45:0x00cb, B:47:0x00d6, B:49:0x00ed, B:53:0x00f6, B:54:0x00fb, B:56:0x0101, B:60:0x010f, B:62:0x0114, B:63:0x0122, B:46:0x00d4), top: B:72:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ed A[Catch: all -> 0x0199, TryCatch #0 {, blocks: (B:24:0x0051, B:26:0x0055, B:30:0x006b, B:31:0x006e, B:35:0x0076, B:41:0x00ae, B:64:0x0125, B:66:0x012e, B:43:0x00c7, B:45:0x00cb, B:47:0x00d6, B:49:0x00ed, B:53:0x00f6, B:54:0x00fb, B:56:0x0101, B:60:0x010f, B:62:0x0114, B:63:0x0122, B:46:0x00d4), top: B:72:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:56:0x0101 A[Catch: all -> 0x0199, TryCatch #0 {, blocks: (B:24:0x0051, B:26:0x0055, B:30:0x006b, B:31:0x006e, B:35:0x0076, B:41:0x00ae, B:64:0x0125, B:66:0x012e, B:43:0x00c7, B:45:0x00cb, B:47:0x00d6, B:49:0x00ed, B:53:0x00f6, B:54:0x00fb, B:56:0x0101, B:60:0x010f, B:62:0x0114, B:63:0x0122, B:46:0x00d4), top: B:72:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x010c  */
    /* JADX WARN: Code duplicated, block: B:59:0x010e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0114 A[Catch: all -> 0x0199, TryCatch #0 {, blocks: (B:24:0x0051, B:26:0x0055, B:30:0x006b, B:31:0x006e, B:35:0x0076, B:41:0x00ae, B:64:0x0125, B:66:0x012e, B:43:0x00c7, B:45:0x00cb, B:47:0x00d6, B:49:0x00ed, B:53:0x00f6, B:54:0x00fb, B:56:0x0101, B:60:0x010f, B:62:0x0114, B:63:0x0122, B:46:0x00d4), top: B:72:0x0051 }] */
    @Override // androidx.media3.extractor.TrackOutput
    public final void OooO0o0(long j, int i, int i2, int i3, @Nullable TrackOutput.OooO00o oooO00o) {
        int i4;
        androidx.media3.exoplayer.drm.OooO0OO oooO0OO;
        androidx.media3.exoplayer.drm.OooO0OO.OooO0O0 oooO0O0OooO0Oo;
        o0Oo0oo<OooO0O0> o0oo0oo2;
        int i5;
        int i6;
        SparseArray<OooO0O0> sparseArray;
        int iKeyAt;
        boolean z;
        boolean z2;
        int i7 = i & 1;
        boolean z3 = i7 != 0;
        if (this.f8061OooOo) {
            if (!z3) {
                return;
            } else {
                this.f8061OooOo = false;
            }
        }
        long j2 = j + 0;
        if (!this.f8068OooOoOO) {
            i4 = i;
        } else {
            if (j2 < this.f8063OooOo00) {
                return;
            }
            if (i7 == 0) {
                if (!this.f8069OooOoo0) {
                    Log.OooO0o("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.f8066OooOoO);
                    this.f8069OooOoo0 = true;
                }
                i4 = i | 1;
            } else {
                i4 = i;
            }
        }
        long j3 = (this.f8043OooO00o.f8094OooO0oO - ((long) i2)) - ((long) i3);
        synchronized (this) {
            int i8 = this.f8057OooOOOo;
            if (i8 > 0) {
                int iOooOO0O = OooOO0O(i8 - 1);
                p080o000OoO.o00Oo0.OooO00o(this.f8052OooOO0O[iOooOO0O] + ((long) this.f8053OooOO0o[iOooOO0O]) <= j3);
            }
            this.f8065OooOo0o = (536870912 & i4) != 0;
            this.f8064OooOo0O = Math.max(this.f8064OooOo0O, j2);
            int iOooOO0O2 = OooOO0O(this.f8057OooOOOo);
            this.f8054OooOOO[iOooOO0O2] = j2;
            this.f8052OooOO0O[iOooOO0O2] = j3;
            this.f8053OooOO0o[iOooOO0O2] = i2;
            this.f8055OooOOO0[iOooOO0O2] = i4;
            this.f8056OooOOOO[iOooOO0O2] = oooO00o;
            this.f8051OooOO0[iOooOO0O2] = 0;
            if (this.f8045OooO0OO.f33882OooO0O0.size() == 0) {
                oooO0OO = this.f8046OooO0Oo;
                if (oooO0OO != null) {
                    oooO0O0OooO0Oo = oooO0OO.OooO0Oo(this.f8048OooO0o0, this.f8066OooOoO);
                } else {
                    oooO0O0OooO0Oo = androidx.media3.exoplayer.drm.OooO0OO.OooO0O0.f7645OooO00o;
                }
                o0oo0oo2 = this.f8045OooO0OO;
                i5 = this.f8059OooOOo0 + this.f8057OooOOOo;
                androidx.media3.common.OooOO0 oooOO1 = this.f8066OooOoO;
                oooOO1.getClass();
                OooO0O0 oooO0O0 = new OooO0O0(oooOO1, oooO0O0OooO0Oo);
                i6 = o0oo0oo2.f33881OooO00o;
                sparseArray = o0oo0oo2.f33882OooO0O0;
                if (i6 == -1) {
                    if (sparseArray.size() == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    p080o000OoO.o00Oo0.OooO0Oo(z2);
                    o0oo0oo2.f33881OooO00o = 0;
                }
                if (sparseArray.size() > 0) {
                    iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                    if (i5 >= iKeyAt) {
                        z = true;
                    } else {
                        z = false;
                    }
                    p080o000OoO.o00Oo0.OooO00o(z);
                    if (iKeyAt == i5) {
                        o0oo0oo2.f33883OooO0OO.accept(sparseArray.valueAt(sparseArray.size() - 1));
                    }
                }
                sparseArray.append(i5, oooO0O0);
            } else {
                SparseArray<OooO0O0> sparseArray2 = this.f8045OooO0OO.f33882OooO0O0;
                if (!sparseArray2.valueAt(sparseArray2.size() - 1).f8073OooO00o.equals(this.f8066OooOoO)) {
                    oooO0OO = this.f8046OooO0Oo;
                    if (oooO0OO != null) {
                        oooO0O0OooO0Oo = oooO0OO.OooO0Oo(this.f8048OooO0o0, this.f8066OooOoO);
                    } else {
                        oooO0O0OooO0Oo = androidx.media3.exoplayer.drm.OooO0OO.OooO0O0.f7645OooO00o;
                    }
                    o0oo0oo2 = this.f8045OooO0OO;
                    i5 = this.f8059OooOOo0 + this.f8057OooOOOo;
                    androidx.media3.common.OooOO0 oooOO2 = this.f8066OooOoO;
                    oooOO2.getClass();
                    OooO0O0 oooO0O1 = new OooO0O0(oooOO2, oooO0O0OooO0Oo);
                    i6 = o0oo0oo2.f33881OooO00o;
                    sparseArray = o0oo0oo2.f33882OooO0O0;
                    if (i6 == -1) {
                        if (sparseArray.size() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        p080o000OoO.o00Oo0.OooO0Oo(z2);
                        o0oo0oo2.f33881OooO00o = 0;
                    }
                    if (sparseArray.size() > 0) {
                        iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                        if (i5 >= iKeyAt) {
                            z = true;
                        } else {
                            z = false;
                        }
                        p080o000OoO.o00Oo0.OooO00o(z);
                        if (iKeyAt == i5) {
                            o0oo0oo2.f33883OooO0OO.accept(sparseArray.valueAt(sparseArray.size() - 1));
                        }
                    }
                    sparseArray.append(i5, oooO0O1);
                }
            }
            int i9 = this.f8057OooOOOo + 1;
            this.f8057OooOOOo = i9;
            int i10 = this.f8042OooO;
            if (i9 == i10) {
                int i11 = i10 + 1000;
                long[] jArr = new long[i11];
                long[] jArr2 = new long[i11];
                long[] jArr3 = new long[i11];
                int[] iArr = new int[i11];
                int[] iArr2 = new int[i11];
                TrackOutput.OooO00o[] oooO00oArr = new TrackOutput.OooO00o[i11];
                int i12 = this.f8058OooOOo;
                int i13 = i10 - i12;
                System.arraycopy(this.f8052OooOO0O, i12, jArr2, 0, i13);
                System.arraycopy(this.f8054OooOOO, this.f8058OooOOo, jArr3, 0, i13);
                System.arraycopy(this.f8055OooOOO0, this.f8058OooOOo, iArr, 0, i13);
                System.arraycopy(this.f8053OooOO0o, this.f8058OooOOo, iArr2, 0, i13);
                System.arraycopy(this.f8056OooOOOO, this.f8058OooOOo, oooO00oArr, 0, i13);
                System.arraycopy(this.f8051OooOO0, this.f8058OooOOo, jArr, 0, i13);
                int i14 = this.f8058OooOOo;
                System.arraycopy(this.f8052OooOO0O, 0, jArr2, i13, i14);
                System.arraycopy(this.f8054OooOOO, 0, jArr3, i13, i14);
                System.arraycopy(this.f8055OooOOO0, 0, iArr, i13, i14);
                System.arraycopy(this.f8053OooOO0o, 0, iArr2, i13, i14);
                System.arraycopy(this.f8056OooOOOO, 0, oooO00oArr, i13, i14);
                System.arraycopy(this.f8051OooOO0, 0, jArr, i13, i14);
                this.f8052OooOO0O = jArr2;
                this.f8054OooOOO = jArr3;
                this.f8055OooOOO0 = iArr;
                this.f8053OooOO0o = iArr2;
                this.f8056OooOOOO = oooO00oArr;
                this.f8051OooOO0 = jArr;
                this.f8058OooOOo = 0;
                this.f8042OooO = i11;
            }
        }
    }

    public final void OooO0oO() {
        long jOooO0o;
        o0OoOo0 o0oooo1 = this.f8043OooO00o;
        synchronized (this) {
            int i = this.f8057OooOOOo;
            jOooO0o = i == 0 ? -1L : OooO0o(i);
        }
        o0oooo1.OooO00o(jOooO0o);
    }

    public final int OooO0oo(long j, boolean z, int i, int i2) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.f8054OooOOO[i];
            if (j2 > j) {
                return i3;
            }
            if (!z || (this.f8055OooOOO0[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.f8042OooO) {
                i = 0;
            }
        }
        return i3;
    }

    public final long OooOO0(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int iOooOO0O = OooOO0O(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            jMax = Math.max(jMax, this.f8054OooOOO[iOooOO0O]);
            if ((this.f8055OooOOO0[iOooOO0O] & 1) != 0) {
                break;
            }
            iOooOO0O--;
            if (iOooOO0O == -1) {
                iOooOO0O = this.f8042OooO - 1;
            }
        }
        return jMax;
    }

    public final int OooOO0O(int i) {
        int i2 = this.f8058OooOOo + i;
        int i3 = this.f8042OooO;
        return i2 < i3 ? i2 : i2 - i3;
    }

    @Nullable
    public final synchronized androidx.media3.common.OooOO0 OooOO0o() {
        return this.f8067OooOoO0 ? null : this.f8066OooOoO;
    }

    public final boolean OooOOO(int i) {
        DrmSession drmSession = this.f8050OooO0oo;
        return drmSession == null || drmSession.getState() == 4 || ((this.f8055OooOOO0[i] & Pow2.MAX_POW2) == 0 && this.f8050OooO0oo.OooO0O0());
    }

    @CallSuper
    public final synchronized boolean OooOOO0(boolean z) {
        androidx.media3.common.OooOO0 oooOO1;
        int i = this.f8060OooOOoo;
        boolean z2 = true;
        if (i != this.f8057OooOOOo) {
            if (this.f8045OooO0OO.OooO00o(this.f8059OooOOo0 + i).f8073OooO00o != this.f8049OooO0oO) {
                return true;
            }
            return OooOOO(OooOO0O(this.f8060OooOOoo));
        }
        if (!z && !this.f8065OooOo0o && ((oooOO1 = this.f8066OooOoO) == null || oooOO1 == this.f8049OooO0oO)) {
            z2 = false;
        }
        return z2;
    }

    public final void OooOOOO(androidx.media3.common.OooOO0 oooOO1, o00O0000 o00o0001) {
        androidx.media3.common.OooOO0 oooOO0OooO00o;
        androidx.media3.common.OooOO0 oooOO2 = this.f8049OooO0oO;
        boolean z = oooOO2 == null;
        DrmInitData drmInitData = z ? null : oooOO2.f6414OooOOo;
        this.f8049OooO0oO = oooOO1;
        DrmInitData drmInitData2 = oooOO1.f6414OooOOo;
        androidx.media3.exoplayer.drm.OooO0OO oooO0OO = this.f8046OooO0Oo;
        if (oooO0OO != null) {
            int iOooO0OO = oooO0OO.OooO0OO(oooOO1);
            androidx.media3.common.OooOO0.OooO00o oooO00oOooO0OO = oooOO1.OooO0OO();
            oooO00oOooO0OO.f6466Oooo000 = iOooO0OO;
            oooOO0OooO00o = oooO00oOooO0OO.OooO00o();
        } else {
            oooOO0OooO00o = oooOO1;
        }
        o00o0001.f34055OooO0O0 = oooOO0OooO00o;
        o00o0001.f34054OooO00o = this.f8050OooO0oo;
        if (oooO0OO == null) {
            return;
        }
        if (z || !o00.OooO00o(drmInitData, drmInitData2)) {
            DrmSession drmSession = this.f8050OooO0oo;
            androidx.media3.exoplayer.drm.OooO0O0.OooO00o oooO00o = this.f8048OooO0o0;
            DrmSession drmSessionOooO0O0 = oooO0OO.OooO0O0(oooO00o, oooOO1);
            this.f8050OooO0oo = drmSessionOooO0O0;
            o00o0001.f34054OooO00o = drmSessionOooO0O0;
            if (drmSession != null) {
                drmSession.OooO0o0(oooO00o);
            }
        }
    }

    @CallSuper
    public final void OooOOOo(boolean z) {
        SparseArray<OooO0O0> sparseArray;
        o0OoOo0 o0oooo1 = this.f8043OooO00o;
        o0OoOo0.OooO00o oooO00o = o0oooo1.f8091OooO0Oo;
        if (oooO00o.f8097OooO0OO != null) {
            p074o000OO0o.o0ooOOo o0ooooo = (p074o000OO0o.o0ooOOo) o0oooo1.f8088OooO00o;
            synchronized (o0ooooo) {
                o0OoOo0.OooO00o oooO00o2 = oooO00o;
                while (oooO00o2 != null) {
                    p074o000OO0o.o00O0O[] o00o0oArr = o0ooooo.f34470OooO0o;
                    int i = o0ooooo.f34471OooO0o0;
                    o0ooooo.f34471OooO0o0 = i + 1;
                    p074o000OO0o.o00O0O o00o0o2 = oooO00o2.f8097OooO0OO;
                    o00o0o2.getClass();
                    o00o0oArr[i] = o00o0o2;
                    o0ooooo.f34469OooO0Oo--;
                    oooO00o2 = oooO00o2.f8098OooO0Oo;
                    if (oooO00o2 == null || oooO00o2.f8097OooO0OO == null) {
                        oooO00o2 = null;
                    }
                }
                o0ooooo.notifyAll();
            }
            oooO00o.f8097OooO0OO = null;
            oooO00o.f8098OooO0Oo = null;
        }
        o0OoOo0.OooO00o oooO00o3 = o0oooo1.f8091OooO0Oo;
        int i2 = o0oooo1.f8089OooO0O0;
        int i3 = 0;
        p080o000OoO.o00Oo0.OooO0Oo(oooO00o3.f8097OooO0OO == null);
        oooO00o3.f8095OooO00o = 0L;
        oooO00o3.f8096OooO0O0 = ((long) i2) + 0;
        o0OoOo0.OooO00o oooO00o4 = o0oooo1.f8091OooO0Oo;
        o0oooo1.f8093OooO0o0 = oooO00o4;
        o0oooo1.f8092OooO0o = oooO00o4;
        o0oooo1.f8094OooO0oO = 0L;
        ((p074o000OO0o.o0ooOOo) o0oooo1.f8088OooO00o).OooO0O0();
        this.f8057OooOOOo = 0;
        this.f8059OooOOo0 = 0;
        this.f8058OooOOo = 0;
        this.f8060OooOOoo = 0;
        this.f8061OooOo = true;
        this.f8063OooOo00 = Long.MIN_VALUE;
        this.f8062OooOo0 = Long.MIN_VALUE;
        this.f8064OooOo0O = Long.MIN_VALUE;
        this.f8065OooOo0o = false;
        o0Oo0oo<OooO0O0> o0oo0oo2 = this.f8045OooO0OO;
        while (true) {
            sparseArray = o0oo0oo2.f33882OooO0O0;
            if (i3 >= sparseArray.size()) {
                break;
            }
            o0oo0oo2.f33883OooO0OO.accept(sparseArray.valueAt(i3));
            i3++;
        }
        o0oo0oo2.f33881OooO00o = -1;
        sparseArray.clear();
        if (z) {
            this.f8066OooOoO = null;
            this.f8067OooOoO0 = true;
        }
    }

    public final int OooOOo(o00000O0 o00000o1, int i, boolean z) throws IOException {
        o0OoOo0 o0oooo1 = this.f8043OooO00o;
        int iOooO0O0 = o0oooo1.OooO0O0(i);
        o0OoOo0.OooO00o oooO00o = o0oooo1.f8092OooO0o;
        p074o000OO0o.o00O0O o00o0o2 = oooO00o.f8097OooO0OO;
        int i2 = o00000o1.read(o00o0o2.f34422OooO00o, ((int) (o0oooo1.f8094OooO0oO - oooO00o.f8095OooO00o)) + o00o0o2.f34423OooO0O0, iOooO0O0);
        if (i2 == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j = o0oooo1.f8094OooO0oO + ((long) i2);
        o0oooo1.f8094OooO0oO = j;
        o0OoOo0.OooO00o oooO00o2 = o0oooo1.f8092OooO0o;
        if (j != oooO00o2.f8096OooO0O0) {
            return i2;
        }
        o0oooo1.f8092OooO0o = oooO00o2.f8098OooO0Oo;
        return i2;
    }

    public final synchronized void OooOOo0() {
        this.f8060OooOOoo = 0;
        o0OoOo0 o0oooo1 = this.f8043OooO00o;
        o0oooo1.f8093OooO0o0 = o0oooo1.f8091OooO0Oo;
    }

    public final synchronized boolean OooOOoo(long j, boolean z) {
        OooOOo0();
        int iOooOO0O = OooOO0O(this.f8060OooOOoo);
        int i = this.f8060OooOOoo;
        int i2 = this.f8057OooOOOo;
        if ((i != i2) && j >= this.f8054OooOOO[iOooOO0O] && (j <= this.f8064OooOo0O || z)) {
            int iOooO0oo = OooO0oo(j, true, iOooOO0O, i2 - i);
            if (iOooO0oo == -1) {
                return false;
            }
            this.f8063OooOo00 = j;
            this.f8060OooOOoo += iOooO0oo;
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000e  */
    public final synchronized void OooOo00(int i) {
        boolean z;
        if (i >= 0) {
            try {
                if (this.f8060OooOOoo + i <= this.f8057OooOOOo) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            z = false;
        }
        p080o000OoO.o00Oo0.OooO00o(z);
        this.f8060OooOOoo += i;
    }
}
