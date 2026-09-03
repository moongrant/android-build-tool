package p679oooo00o;

import androidx.media3.common.OooOO0;
import androidx.media3.extractor.TrackOutput;
import java.io.IOException;
import o000OOoO.OooOO0O;
import o000OOoO.Oooo0;
import o000OOoO.o000000;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p080o000OoO.o000O000;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oO0O00O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f60409OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public TrackOutput f60411OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Oooo0 f60412OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public oO0O000o f60413OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f60414OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f60415OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f60416OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f60417OooO0oo;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f60419OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f60420OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f60421OooOOO0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oO0 f60410OooO00o = new oO0();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public OooO00o f60418OooOO0 = new OooO00o();

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public OooOO0 f60422OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public oOo0000O.OooO00o f60423OooO0O0;
    }

    public static final class OooO0O0 implements oO0O000o {
        @Override // p679oooo00o.oO0O000o
        public final o000000 OooO00o() {
            return new o000000.OooO0O0(-9223372036854775807L);
        }

        @Override // p679oooo00o.oO0O000o
        public final void OooO0O0(long j) {
        }

        @Override // p679oooo00o.oO0O000o
        public final long OooO0OO(OooOO0O oooOO0O) {
            return -1L;
        }
    }

    public void OooO00o(long j) {
        this.f60416OooO0oO = j;
    }

    public abstract long OooO0O0(o000O000 o000o001);

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public abstract boolean OooO0OO(o000O000 o000o001, long j, OooO00o oooO00o) throws IOException;

    public void OooO0Oo(boolean z) {
        if (z) {
            this.f60418OooOO0 = new OooO00o();
            this.f60414OooO0o = 0L;
            this.f60417OooO0oo = 0;
        } else {
            this.f60417OooO0oo = 1;
        }
        this.f60415OooO0o0 = -1L;
        this.f60416OooO0oO = 0L;
    }
}
