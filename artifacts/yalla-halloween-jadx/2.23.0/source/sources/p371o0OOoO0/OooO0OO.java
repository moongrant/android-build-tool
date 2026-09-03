package p371o0OOoO0;

import com.yalla.support.longlink.exception.ReadException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p368o0OOo0oO.o000oOoO;
import p368o0OOo0oO.o00Oo0;
import p368o0OOo0oO.o0OoOo0;
import p369o0OOo0oo.o00oO0o;
import p373o0OOoO0O.OooOOO;
import p373o0OOoO0O.OooOOOO;
import p667o0oooOoO.wc;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0OO extends o00Oo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final InputStream f44036OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f44037OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o000oOoO f44038OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final OooOOO f44039OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final o0OoOo0 f44040OooOO0O;

    public OooO0OO(@NotNull InputStream input, @NotNull OooOOOO msgProcessor, @NotNull o0OoOo0 config) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(msgProcessor, "msgProcessor");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f44036OooO = input;
        this.f44039OooOO0 = msgProcessor;
        this.f44040OooOO0O = config;
        config.f43998OooO0oo.OooO0O0();
        this.f44037OooO0oO = 1;
        this.f44038OooO0oo = new o000oOoO(1);
    }

    @Override // p368o0OOo0oO.o00Oo0
    public final void OooO0O0() {
        wc.OooO00o(this.f44040OooOO0O.f43994OooO0Oo).OooO00o("Msg Reader End", new Object[0]);
    }

    @Override // p368o0OOo0oO.o00Oo0
    public final void OooO0OO() {
        wc.OooO00o(this.f44040OooOO0O.f43994OooO0Oo).OooO00o("Msg Reader Start", new Object[0]);
    }

    @Override // p368o0OOo0oO.o00Oo0
    public final void OooO0Oo() {
        super.OooO0Oo();
        try {
            this.f44036OooO.close();
        } catch (Throwable th) {
            wc.OooO00o(this.f44040OooOO0O.f43994OooO0Oo).OooO0OO(th);
        }
    }

    @Override // p368o0OOo0oO.o00Oo0
    public final void OooO0o0() {
        try {
            if (this.f44038OooO0oo.f43982OooO0O0 != 0) {
                wc.OooO00o(this.f44040OooOO0O.f43994OooO0Oo).OooO00o("start loop, readBuffer offset = " + this.f44038OooO0oo.f43982OooO0O0, new Object[0]);
            }
            o000oOoO o000oooo2 = this.f44038OooO0oo;
            byte[] bArr = o000oooo2.f43981OooO00o;
            int i = o000oooo2.f43983OooO0OO;
            int i2 = o000oooo2.f43982OooO0O0;
            while (i2 < i) {
                int i3 = this.f44036OooO.read(bArr, i2, i - i2);
                if (i3 == -1) {
                    throw new ReadException("Touch the end of stream when reading header");
                }
                i2 += i3;
                o000oooo2.f43982OooO0O0 = i2;
            }
            if (this.f44038OooO0oo.f43982OooO0O0 != this.f44037OooO0oO) {
                wc.OooO00o(this.f44040OooOO0O.f43994OooO0Oo).OooO00o("After read header, but offset = " + this.f44038OooO0oo.f43982OooO0O0 + " and pkg header length = " + this.f44037OooO0oO, new Object[0]);
            }
            this.f44040OooOO0O.f43998OooO0oo.OooO00o(this.f44038OooO0oo.f43981OooO00o);
            long j = 1;
            long j2 = this.f44040OooOO0O.f43996OooO0o0;
            if (j <= j2) {
                o000oOoO o000oooo3 = this.f44038OooO0oo;
                if (o000oooo3.f43983OooO0OO <= j2) {
                    byte[] bArr2 = o000oooo3.f43981OooO00o;
                    byte[] bArr3 = new byte[1];
                    o000oooo3.f43981OooO00o = bArr3;
                    System.arraycopy(bArr2, 0, bArr3, 0, o000oooo3.f43982OooO0O0);
                    o000oooo3.f43983OooO0OO = 1;
                    o000oOoO o000oooo4 = this.f44038OooO0oo;
                    byte[] bArr4 = o000oooo4.f43981OooO00o;
                    int i4 = o000oooo4.f43983OooO0OO;
                    int i5 = o000oooo4.f43982OooO0O0;
                    while (i5 < i4) {
                        int i6 = this.f44036OooO.read(bArr4, i5, i4 - i5);
                        if (i6 == -1) {
                            throw new ReadException("Touch the end of stream when reading body");
                        }
                        i5 += i6;
                        o000oooo4.f43982OooO0O0 = i5;
                    }
                    o000oOoO o000oooo5 = this.f44038OooO0oo;
                    if (1 != o000oooo5.f43983OooO0OO) {
                        throw new ReadException("Out of buffer! pkg total length is 1, read buffer length is " + this.f44038OooO0oo.f43983OooO0OO);
                    }
                    this.f44039OooOO0.OooO00o(o000oooo5.f43981OooO00o);
                    o000oOoO o000oooo6 = this.f44038OooO0oo;
                    int i7 = o000oooo6.f43984OooO0Oo;
                    o000oooo6.f43981OooO00o = new byte[i7];
                    o000oooo6.f43983OooO0OO = i7;
                    o000oooo6.f43982OooO0O0 = 0;
                    return;
                }
            }
            throw new ReadException("Protocol allowed pkg size in byte is " + this.f44040OooOO0O.f43996OooO0o0 + ", but according to the pkg header the pkg size is 1");
        } catch (Throwable th) {
            if (!this.f43986OooO0Oo) {
                this.f44040OooOO0O.f43997OooO0oO.OooO0oO(new o00oO0o.OooO0O0(0, th));
                OooO0Oo();
            }
            wc.OooO00o(this.f44040OooOO0O.f43994OooO0Oo).OooO0OO(th);
        }
    }
}
