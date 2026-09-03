package p434o0OoOOOO;

import android.view.MotionEvent;
import android.widget.ImageView;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import com.yalla.yalla.ui.vm.message.PrivateChatVM;
import java.io.IOException;
import java.util.TimerTask;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import p358o0OOOoo.o000oOoO;
import p405o0Oo0OOO.oO0O00oO;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00o0 extends TimerTask {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0oOOo f46972OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ PrivateChatVM f46973OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MotionEvent f46974OooO0o0;

    public o0O00o0(o0oOOo o0oooo, MotionEvent motionEvent, PrivateChatVM privateChatVM) {
        this.f46972OooO0Oo = o0oooo;
        this.f46974OooO0o0 = motionEvent;
        this.f46973OooO0o = privateChatVM;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        final o0oOOo o0oooo = this.f46972OooO0Oo;
        o0oooo.f46977OooO = true;
        o000oOoO o000oooo2 = o0oooo.f46984OooO0oO;
        o0oooo.f46985OooO0oo = 0;
        String str = o0oooo.f46982OooO0o + UUID.randomUUID() + ".aac";
        o0oooo.f46980OooO0OO = str;
        try {
            o000oooo2.OooO0Oo(str);
            o000oooo2.start();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
        while (o0oooo.f46977OooO) {
            try {
                Thread.sleep(200L);
            } catch (InterruptedException e3) {
                e3.printStackTrace();
            }
            int i = o0oooo.f46985OooO0oo + 200;
            o0oooo.f46985OooO0oo = i;
            PrivateChatActivity privateChatActivity = o0oooo.f46978OooO00o;
            if (i >= 30000) {
                privateChatActivity.runOnUiThread(new o00OOOOo(o0oooo, this.f46974OooO0o0, this.f46973OooO0o));
            } else if (o0oooo.f46977OooO) {
                if (i % 1000 == 0) {
                    privateChatActivity.runOnUiThread(new o0oOO(o0oooo, i));
                }
                final double d = o000oooo2.f42937OooOOO;
                privateChatActivity.runOnUiThread(new Runnable() { // from class: o0OoOOOO.o00Oo00
                    @Override // java.lang.Runnable
                    public final void run() {
                        o0oOOo this$0 = o0oooo;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        double d2 = d;
                        oO0O00oO oo0o00oo = null;
                        if (d2 == 0.0d) {
                            oO0O00oO oo0o00oo2 = this$0.f46979OooO0O0;
                            if (oo0o00oo2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                                oo0o00oo2 = null;
                            }
                            oo0o00oo2.f44883OooO0o.f45236OooO0Oo.setVisibility(4);
                            oO0O00oO oo0o00oo3 = this$0.f46979OooO0O0;
                            if (oo0o00oo3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            } else {
                                oo0o00oo = oo0o00oo3;
                            }
                            oo0o00oo.f44883OooO0o.f45238OooO0o0.setVisibility(4);
                            return;
                        }
                        oO0O00oO oo0o00oo4 = this$0.f46979OooO0O0;
                        if (oo0o00oo4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            oo0o00oo4 = null;
                        }
                        oo0o00oo4.f44883OooO0o.f45236OooO0Oo.setVisibility(0);
                        oO0O00oO oo0o00oo5 = this$0.f46979OooO0O0;
                        if (oo0o00oo5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            oo0o00oo5 = null;
                        }
                        oo0o00oo5.f44883OooO0o.f45238OooO0o0.setVisibility(0);
                        int i2 = (int) (d2 / ((double) 2000));
                        if (i2 == 0) {
                            oO0O00oO oo0o00oo6 = this$0.f46979OooO0O0;
                            if (oo0o00oo6 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                                oo0o00oo6 = null;
                            }
                            ImageView imageView = oo0o00oo6.f44883OooO0o.f45236OooO0Oo;
                            int i3 = o0Oo0oo.icon_record_1;
                            imageView.setImageResource(i3);
                            oO0O00oO oo0o00oo7 = this$0.f46979OooO0O0;
                            if (oo0o00oo7 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            } else {
                                oo0o00oo = oo0o00oo7;
                            }
                            oo0o00oo.f44883OooO0o.f45238OooO0o0.setImageResource(i3);
                            return;
                        }
                        if (i2 == 1) {
                            oO0O00oO oo0o00oo8 = this$0.f46979OooO0O0;
                            if (oo0o00oo8 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                                oo0o00oo8 = null;
                            }
                            ImageView imageView2 = oo0o00oo8.f44883OooO0o.f45236OooO0Oo;
                            int i4 = o0Oo0oo.icon_record_2;
                            imageView2.setImageResource(i4);
                            oO0O00oO oo0o00oo9 = this$0.f46979OooO0O0;
                            if (oo0o00oo9 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            } else {
                                oo0o00oo = oo0o00oo9;
                            }
                            oo0o00oo.f44883OooO0o.f45238OooO0o0.setImageResource(i4);
                            return;
                        }
                        if (i2 == 2) {
                            oO0O00oO oo0o00oo10 = this$0.f46979OooO0O0;
                            if (oo0o00oo10 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                                oo0o00oo10 = null;
                            }
                            ImageView imageView3 = oo0o00oo10.f44883OooO0o.f45236OooO0Oo;
                            int i5 = o0Oo0oo.icon_record_3;
                            imageView3.setImageResource(i5);
                            oO0O00oO oo0o00oo11 = this$0.f46979OooO0O0;
                            if (oo0o00oo11 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            } else {
                                oo0o00oo = oo0o00oo11;
                            }
                            oo0o00oo.f44883OooO0o.f45238OooO0o0.setImageResource(i5);
                            return;
                        }
                        if (i2 == 3) {
                            oO0O00oO oo0o00oo12 = this$0.f46979OooO0O0;
                            if (oo0o00oo12 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                                oo0o00oo12 = null;
                            }
                            ImageView imageView4 = oo0o00oo12.f44883OooO0o.f45236OooO0Oo;
                            int i6 = o0Oo0oo.icon_record_4;
                            imageView4.setImageResource(i6);
                            oO0O00oO oo0o00oo13 = this$0.f46979OooO0O0;
                            if (oo0o00oo13 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            } else {
                                oo0o00oo = oo0o00oo13;
                            }
                            oo0o00oo.f44883OooO0o.f45238OooO0o0.setImageResource(i6);
                            return;
                        }
                        if (i2 == 4) {
                            oO0O00oO oo0o00oo14 = this$0.f46979OooO0O0;
                            if (oo0o00oo14 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                                oo0o00oo14 = null;
                            }
                            ImageView imageView5 = oo0o00oo14.f44883OooO0o.f45236OooO0Oo;
                            int i7 = o0Oo0oo.icon_record_5;
                            imageView5.setImageResource(i7);
                            oO0O00oO oo0o00oo15 = this$0.f46979OooO0O0;
                            if (oo0o00oo15 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            } else {
                                oo0o00oo = oo0o00oo15;
                            }
                            oo0o00oo.f44883OooO0o.f45238OooO0o0.setImageResource(i7);
                            return;
                        }
                        if (i2 != 5) {
                            return;
                        }
                        oO0O00oO oo0o00oo16 = this$0.f46979OooO0O0;
                        if (oo0o00oo16 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            oo0o00oo16 = null;
                        }
                        ImageView imageView6 = oo0o00oo16.f44883OooO0o.f45238OooO0o0;
                        int i8 = o0Oo0oo.icon_record_5;
                        imageView6.setImageResource(i8);
                        oO0O00oO oo0o00oo17 = this$0.f46979OooO0O0;
                        if (oo0o00oo17 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        } else {
                            oo0o00oo = oo0o00oo17;
                        }
                        oo0o00oo.f44883OooO0o.f45236OooO0Oo.setImageResource(i8);
                    }
                });
            }
        }
    }
}
