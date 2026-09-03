package androidx.emoji2.text;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.ui.activity.moment.TopicCreateNameActivity;
import java.nio.MappedByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import p063o0000oO.o000OOo;
import p371o0OOo0oO.o0OOO0o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Oooo0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f5650OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f5651OooO0o0;

    public /* synthetic */ Oooo0(Object obj, int i) {
        this.f5650OooO0Oo = i;
        this.f5651OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5650OooO0Oo) {
            case 0:
                Oooo000.OooO0O0 oooO0O0 = (Oooo000.OooO0O0) this.f5651OooO0o0;
                synchronized (oooO0O0.f5656OooO0Oo) {
                    if (oooO0O0.f5660OooO0oo == null) {
                        return;
                    }
                    try {
                        o0000O0.Oooo000 oooo000OooO0Oo = oooO0O0.OooO0Oo();
                        int i = oooo000OooO0Oo.f33571OooO0o0;
                        if (i == 2) {
                            synchronized (oooO0O0.f5656OooO0Oo) {
                            }
                        }
                        if (i != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                        }
                        try {
                            int i2 = o000OOo.f33777OooO00o;
                            o000OOo.OooO00o.OooO00o("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Oooo000.OooO00o oooO00o = oooO0O0.f5655OooO0OO;
                            Context context = oooO0O0.f5653OooO00o;
                            oooO00o.getClass();
                            Typeface typefaceOooO0O0 = p052o00000oO.OooOOOO.f33484OooO00o.OooO0O0(context, new o0000O0.Oooo000[]{oooo000OooO0Oo}, 0);
                            MappedByteBuffer mappedByteBufferOooO0o0 = p052o00000oO.o00Oo0.OooO0o0(oooO0O0.f5653OooO00o, oooo000OooO0Oo.f33567OooO00o);
                            if (mappedByteBufferOooO0o0 == null || typefaceOooO0O0 == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            try {
                                o000OOo.OooO00o.OooO00o("EmojiCompat.MetadataRepo.create");
                                o0OoOo0 o0oooo1 = new o0OoOo0(typefaceOooO0O0, o000oOoO.OooO00o(mappedByteBufferOooO0o0));
                                o000OOo.OooO00o.OooO0O0();
                                o000OOo.OooO00o.OooO0O0();
                                synchronized (oooO0O0.f5656OooO0Oo) {
                                    EmojiCompat.OooOOO oooOOO = oooO0O0.f5660OooO0oo;
                                    if (oooOOO != null) {
                                        oooOOO.OooO0O0(o0oooo1);
                                    }
                                    break;
                                }
                                oooO0O0.OooO0O0();
                                return;
                            } catch (Throwable th) {
                                int i3 = o000OOo.f33777OooO00o;
                                o000OOo.OooO00o.OooO0O0();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            int i4 = o000OOo.f33777OooO00o;
                            o000OOo.OooO00o.OooO0O0();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        synchronized (oooO0O0.f5656OooO0Oo) {
                            EmojiCompat.OooOOO oooOOO2 = oooO0O0.f5660OooO0oo;
                            if (oooOOO2 != null) {
                                oooOOO2.OooO00o(th3);
                            }
                            oooO0O0.OooO0O0();
                            return;
                        }
                    }
                    break;
                }
            default:
                TopicCreateNameActivity this$0 = (TopicCreateNameActivity) this.f5651OooO0o0;
                int i5 = TopicCreateNameActivity.f25851OooOo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                EditText view = this$0.OooOo().f45032OooO0O0;
                Intrinsics.checkNotNullExpressionValue(view, "etName");
                Intrinsics.checkNotNullParameter(view, "view");
                Context context2 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                InputMethodManager inputMethodManagerOooO00o = o0OOO0o.OooO00o(context2);
                view.setFocusable(true);
                view.setFocusableInTouchMode(true);
                view.requestFocus();
                inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(view.getContext().getApplicationContext(), new Handler()));
                return;
        }
    }
}
