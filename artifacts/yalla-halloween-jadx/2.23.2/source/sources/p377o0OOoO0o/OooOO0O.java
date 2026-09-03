package p377o0OOoO0o;

import com.yalla.support.longlink.exception.ReadException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p373o0OOoO.OooO;
import p373o0OOoO.OooOO0;
import p374o0OOoO0.OooOOOO;
import p375o0OOoO00.Oooo0;
import p375o0OOoO00.Oooo000;
import p375o0OOoO00.o0OoOo0;
import p672o0oooo0O.oO000O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O extends o0OoOo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final InputStream f43239OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f43240OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Oooo000 f43241OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final OooO f43242OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final Oooo0 f43243OooOO0O;

    public OooOO0O(@NotNull InputStream input, @NotNull OooOO0 msgProcessor, @NotNull Oooo0 config) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(msgProcessor, "msgProcessor");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f43239OooO = input;
        this.f43242OooOO0 = msgProcessor;
        this.f43243OooOO0O = config;
        config.f43215OooO0oo.OooO0O0();
        this.f43240OooO0oO = 1;
        this.f43241OooO0oo = new Oooo000(1);
    }

    @Override // p375o0OOoO00.o0OoOo0
    public final void OooO0O0() {
        oO000O0O.OooO00o(this.f43243OooOO0O.f43211OooO0Oo).OooO00o("Msg Reader End", new Object[0]);
    }

    @Override // p375o0OOoO00.o0OoOo0
    public final void OooO0OO() {
        oO000O0O.OooO00o(this.f43243OooOO0O.f43211OooO0Oo).OooO00o("Msg Reader Start", new Object[0]);
    }

    @Override // p375o0OOoO00.o0OoOo0
    public final void OooO0Oo() {
        super.OooO0Oo();
        try {
            this.f43239OooO.close();
        } catch (Throwable th) {
            oO000O0O.OooO00o(this.f43243OooOO0O.f43211OooO0Oo).OooO0OO(th);
        }
    }

    @Override // p375o0OOoO00.o0OoOo0
    public final void OooO0o0() {
        try {
            if (this.f43241OooO0oo.f43217OooO0O0 != 0) {
                oO000O0O.OooO00o(this.f43243OooOO0O.f43211OooO0Oo).OooO00o("start loop, readBuffer offset = " + this.f43241OooO0oo.f43217OooO0O0, new Object[0]);
            }
            Oooo000 oooo000 = this.f43241OooO0oo;
            byte[] bArr = oooo000.f43216OooO00o;
            int i = oooo000.f43218OooO0OO;
            int i2 = oooo000.f43217OooO0O0;
            while (i2 < i) {
                int i3 = this.f43239OooO.read(bArr, i2, i - i2);
                if (i3 == -1) {
                    throw new ReadException("Touch the end of stream when reading header");
                }
                i2 += i3;
                oooo000.f43217OooO0O0 = i2;
            }
            if (this.f43241OooO0oo.f43217OooO0O0 != this.f43240OooO0oO) {
                oO000O0O.OooO00o(this.f43243OooOO0O.f43211OooO0Oo).OooO00o("After read header, but offset = " + this.f43241OooO0oo.f43217OooO0O0 + " and pkg header length = " + this.f43240OooO0oO, new Object[0]);
            }
            this.f43243OooOO0O.f43215OooO0oo.OooO00o(this.f43241OooO0oo.f43216OooO00o);
            long j = 1;
            long j2 = this.f43243OooOO0O.f43213OooO0o0;
            if (j <= j2) {
                Oooo000 oooo001 = this.f43241OooO0oo;
                if (oooo001.f43218OooO0OO <= j2) {
                    byte[] bArr2 = oooo001.f43216OooO00o;
                    byte[] bArr3 = new byte[1];
                    oooo001.f43216OooO00o = bArr3;
                    System.arraycopy(bArr2, 0, bArr3, 0, oooo001.f43217OooO0O0);
                    oooo001.f43218OooO0OO = 1;
                    Oooo000 oooo002 = this.f43241OooO0oo;
                    byte[] bArr4 = oooo002.f43216OooO00o;
                    int i4 = oooo002.f43218OooO0OO;
                    int i5 = oooo002.f43217OooO0O0;
                    while (i5 < i4) {
                        int i6 = this.f43239OooO.read(bArr4, i5, i4 - i5);
                        if (i6 == -1) {
                            throw new ReadException("Touch the end of stream when reading body");
                        }
                        i5 += i6;
                        oooo002.f43217OooO0O0 = i5;
                    }
                    Oooo000 oooo003 = this.f43241OooO0oo;
                    if (1 != oooo003.f43218OooO0OO) {
                        throw new ReadException("Out of buffer! pkg total length is 1, read buffer length is " + this.f43241OooO0oo.f43218OooO0OO);
                    }
                    this.f43242OooOO0.OooO00o(oooo003.f43216OooO00o);
                    Oooo000 oooo004 = this.f43241OooO0oo;
                    int i7 = oooo004.f43219OooO0Oo;
                    oooo004.f43216OooO00o = new byte[i7];
                    oooo004.f43218OooO0OO = i7;
                    oooo004.f43217OooO0O0 = 0;
                    return;
                }
            }
            throw new ReadException("Protocol allowed pkg size in byte is " + this.f43243OooOO0O.f43213OooO0o0 + ", but according to the pkg header the pkg size is 1");
        } catch (Throwable th) {
            if (!this.f43236OooO0Oo) {
                this.f43243OooOO0O.f43214OooO0oO.OooO0oO(new OooOOOO.OooO0O0(0, th));
                OooO0Oo();
            }
            oO000O0O.OooO00o(this.f43243OooOO0O.f43211OooO0Oo).OooO0OO(th);
        }
    }
}
