package p475o0OoooOo;

import com.yalla.support.longlink.exception.ReadException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p469o0Oooo.o00oO0o;
import p469o0Oooo.o0OOO0o;
import p469o0Oooo.oo000o;
import p472o0OoooO.o0O0ooO;
import p477o0Ooooo0.o00OO0O0;
import p705oO0Ooo0O.o00Ooo;

/* JADX INFO: loaded from: classes2.dex */
public final class oO000 extends o0OOO0o {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final int f40657Oooo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final o00oO0o f40658OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final InputStream f40659OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final oo000o f40660OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final o00OO0O0 f40661OoooO0O;

    public oO000(@NotNull InputStream input, @NotNull o00OO0O0 msgProcessor, @NotNull o00oO0o config) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(msgProcessor, "msgProcessor");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f40659OoooO0 = input;
        this.f40661OoooO0O = msgProcessor;
        this.f40658OoooO = config;
        config.f40580OooO.OooO0OO();
        this.f40657Oooo = 1;
        this.f40660OoooO00 = new oo000o(1);
    }

    @Override // p469o0Oooo.o0OOO0o
    public final void OooO0O0() {
        o00Ooo.OooO00o(this.f40658OoooO.f40584OooO0Oo).OooO00o("Msg Reader End", new Object[0]);
    }

    @Override // p469o0Oooo.o0OOO0o
    public final void OooO0OO() {
        o00Ooo.OooO00o(this.f40658OoooO.f40584OooO0Oo).OooO00o("Msg Reader Start", new Object[0]);
    }

    @Override // p469o0Oooo.o0OOO0o
    public final void OooO0Oo() {
        super.OooO0Oo();
        try {
            this.f40659OoooO0.close();
        } catch (Throwable th) {
            o00Ooo.OooO00o(this.f40658OoooO.f40584OooO0Oo).OooO0OO(th);
        }
    }

    @Override // p469o0Oooo.o0OOO0o
    public final void OooO0o0() {
        try {
            if (this.f40660OoooO00.f40611OooO0O0 != 0) {
                o00Ooo.OooO00o(this.f40658OoooO.f40584OooO0Oo).OooO00o("start loop, readBuffer offset = " + this.f40660OoooO00.f40611OooO0O0, new Object[0]);
            }
            oo000o oo000oVar = this.f40660OoooO00;
            byte[] bArr = oo000oVar.f40610OooO00o;
            int i = oo000oVar.f40612OooO0OO;
            int i2 = oo000oVar.f40611OooO0O0;
            while (i2 < i) {
                int i3 = this.f40659OoooO0.read(bArr, i2, i - i2);
                if (i3 == -1) {
                    throw new ReadException("Touch the end of stream when reading header");
                }
                i2 += i3;
                this.f40660OoooO00.f40611OooO0O0 = i2;
            }
            if (this.f40660OoooO00.f40611OooO0O0 != this.f40657Oooo) {
                o00Ooo.OooO00o(this.f40658OoooO.f40584OooO0Oo).OooO00o("After read header, but offset = " + this.f40660OoooO00.f40611OooO0O0 + " and pkg header length = " + this.f40657Oooo, new Object[0]);
            }
            this.f40658OoooO.f40580OooO.OooO00o(this.f40660OoooO00.f40610OooO00o);
            long j = 1;
            long j2 = this.f40658OoooO.f40586OooO0o0;
            if (j <= j2) {
                oo000o oo000oVar2 = this.f40660OoooO00;
                if (oo000oVar2.f40612OooO0OO <= j2) {
                    byte[] bArr2 = oo000oVar2.f40610OooO00o;
                    byte[] bArr3 = new byte[1];
                    oo000oVar2.f40610OooO00o = bArr3;
                    System.arraycopy(bArr2, 0, bArr3, 0, oo000oVar2.f40611OooO0O0);
                    oo000oVar2.f40612OooO0OO = 1;
                    oo000o oo000oVar3 = this.f40660OoooO00;
                    byte[] bArr4 = oo000oVar3.f40610OooO00o;
                    int i4 = oo000oVar3.f40612OooO0OO;
                    int i5 = oo000oVar3.f40611OooO0O0;
                    while (i5 < i4) {
                        int i6 = this.f40659OoooO0.read(bArr4, i5, i4 - i5);
                        if (i6 == -1) {
                            throw new ReadException("Touch the end of stream when reading body");
                        }
                        i5 += i6;
                        this.f40660OoooO00.f40611OooO0O0 = i5;
                    }
                    oo000o oo000oVar4 = this.f40660OoooO00;
                    if (1 != oo000oVar4.f40612OooO0OO) {
                        throw new ReadException("Out of buffer! pkg total length is 1, read buffer length is " + this.f40660OoooO00.f40612OooO0OO);
                    }
                    this.f40661OoooO0O.OooO00o(oo000oVar4.f40610OooO00o);
                    oo000o oo000oVar5 = this.f40660OoooO00;
                    int i7 = oo000oVar5.f40613OooO0Oo;
                    oo000oVar5.f40610OooO00o = new byte[i7];
                    oo000oVar5.f40612OooO0OO = i7;
                    oo000oVar5.f40611OooO0O0 = 0;
                    return;
                }
            }
            throw new ReadException("Protocol allowed pkg size in byte is " + this.f40658OoooO.f40586OooO0o0 + ", but according to the pkg header the pkg size is 1");
        } catch (Throwable th) {
            if (!this.f40603Oooo0o) {
                this.f40658OoooO.f40588OooO0oo.OooO0oO(new o0O0ooO.OooO0O0(0, th));
                OooO0Oo();
            }
            o00Ooo.OooO00o(this.f40658OoooO.f40584OooO0Oo).OooO0OO(th);
        }
    }
}
