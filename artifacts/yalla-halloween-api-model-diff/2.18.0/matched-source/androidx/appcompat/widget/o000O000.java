package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Typeface;
import androidx.emoji2.text.EmojiCompat;
import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000O000 implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f5391Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f5392OoooO00;

    public /* synthetic */ o000O000(Object obj, int i) {
        this.f5391Oooo = i;
        this.f5392OoooO00 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5391Oooo) {
            case 0:
                ((o000O0o) this.f5392OoooO00).OooO00o();
                return;
            default:
                androidx.emoji2.text.OooOOO.OooO0O0 oooO0O0 = (androidx.emoji2.text.OooOOO.OooO0O0) this.f5392OoooO00;
                synchronized (oooO0O0.f8144OooO0Oo) {
                    if (oooO0O0.f8148OooO0oo == null) {
                        return;
                    }
                    try {
                        o000O0.Oooo000 oooo000OooO0Oo = oooO0O0.OooO0Oo();
                        int i = oooo000OooO0Oo.f28099OooO0o0;
                        if (i == 2) {
                            synchronized (oooO0O0.f8144OooO0Oo) {
                            }
                        }
                        if (i != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                        }
                        try {
                            int i2 = o000O00O.OooOo.f28115OooO00o;
                            o000O00O.OooOo.OooO00o.OooO00o("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            androidx.emoji2.text.OooOOO.OooO00o oooO00o = oooO0O0.f8143OooO0OO;
                            Context context = oooO0O0.f8141OooO00o;
                            Objects.requireNonNull(oooO00o);
                            Typeface typefaceOooO0O0 = p071o000O0o.OooOOO0.f28195OooO00o.OooO0O0(context, new o000O0.Oooo000[]{oooo000OooO0Oo}, 0);
                            ByteBuffer byteBufferOooO0o0 = p071o000O0o.o000oOoO.OooO0o0(oooO0O0.f8141OooO00o, oooo000OooO0Oo.f28095OooO00o);
                            if (byteBufferOooO0o0 == null || typefaceOooO0O0 == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            try {
                                o000O00O.OooOo.OooO00o.OooO00o("EmojiCompat.MetadataRepo.create");
                                androidx.emoji2.text.OooOo oooOo = new androidx.emoji2.text.OooOo(typefaceOooO0O0, androidx.emoji2.text.OooOo00.OooO00o(byteBufferOooO0o0));
                                o000O00O.OooOo.OooO00o.OooO0O0();
                                o000O00O.OooOo.OooO00o.OooO0O0();
                                synchronized (oooO0O0.f8144OooO0Oo) {
                                    EmojiCompat.OooOOO0 oooOOO0 = oooO0O0.f8148OooO0oo;
                                    if (oooOOO0 != null) {
                                        oooOOO0.OooO0O0(oooOo);
                                    }
                                    break;
                                }
                                oooO0O0.OooO0O0();
                                return;
                            } catch (Throwable th) {
                                int i3 = o000O00O.OooOo.f28115OooO00o;
                                o000O00O.OooOo.OooO00o.OooO0O0();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            int i4 = o000O00O.OooOo.f28115OooO00o;
                            o000O00O.OooOo.OooO00o.OooO0O0();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        synchronized (oooO0O0.f8144OooO0Oo) {
                            EmojiCompat.OooOOO0 oooOOO1 = oooO0O0.f8148OooO0oo;
                            if (oooOOO1 != null) {
                                oooOOO1.OooO00o(th3);
                            }
                            oooO0O0.OooO0O0();
                            return;
                        }
                    }
                    break;
                }
        }
    }
}
