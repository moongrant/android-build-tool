package p430o0OoOOO0;

import android.view.MotionEvent;
import android.widget.ImageView;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import com.yalla.yalla.ui.vm.message.PrivateChatVM;
import java.io.IOException;
import java.util.TimerTask;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import p357o0OOOoo0.OooOo00;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.j5;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00O extends TimerTask {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00O00OO f45808OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ PrivateChatVM f45809OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MotionEvent f45810OooO0o0;

    public o00O00O(o00O00OO o00o00oo2, MotionEvent motionEvent, PrivateChatVM privateChatVM) {
        this.f45808OooO0Oo = o00o00oo2;
        this.f45810OooO0o0 = motionEvent;
        this.f45809OooO0o = privateChatVM;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        final o00O00OO o00o00oo2 = this.f45808OooO0Oo;
        o00o00oo2.f45811OooO = true;
        OooOo00 oooOo00 = o00o00oo2.f45818OooO0oO;
        o00o00oo2.f45819OooO0oo = 0;
        String str = o00o00oo2.f45816OooO0o + UUID.randomUUID() + ".aac";
        o00o00oo2.f45814OooO0OO = str;
        try {
            oooOo00.OooO0Oo(str);
            oooOo00.start();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
        while (o00o00oo2.f45811OooO) {
            try {
                Thread.sleep(200L);
            } catch (InterruptedException e3) {
                e3.printStackTrace();
            }
            int i = o00o00oo2.f45819OooO0oo + 200;
            o00o00oo2.f45819OooO0oo = i;
            PrivateChatActivity privateChatActivity = o00o00oo2.f45812OooO00o;
            if (i >= 30000) {
                privateChatActivity.runOnUiThread(new o00O000(o00o00oo2, this.f45810OooO0o0, this.f45809OooO0o));
            } else if (o00o00oo2.f45811OooO) {
                if (i % 1000 == 0) {
                    privateChatActivity.runOnUiThread(new o00O00(o00o00oo2, i));
                }
                final double d = oooOo00.f43760OooOOO;
                privateChatActivity.runOnUiThread(new Runnable() { // from class: o0OoOOO0.o00O000o
                    @Override // java.lang.Runnable
                    public final void run() {
                        o00O00OO this$0 = o00o00oo2;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        double d2 = d;
                        j5 j5Var = null;
                        if (d2 == 0.0d) {
                            j5 j5Var2 = this$0.f45813OooO0O0;
                            if (j5Var2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                                j5Var2 = null;
                            }
                            j5Var2.f58171OooO0o.f58594OooO0Oo.setVisibility(4);
                            j5 j5Var3 = this$0.f45813OooO0O0;
                            if (j5Var3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            } else {
                                j5Var = j5Var3;
                            }
                            j5Var.f58171OooO0o.f58596OooO0o0.setVisibility(4);
                            return;
                        }
                        j5 j5Var4 = this$0.f45813OooO0O0;
                        if (j5Var4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            j5Var4 = null;
                        }
                        j5Var4.f58171OooO0o.f58594OooO0Oo.setVisibility(0);
                        j5 j5Var5 = this$0.f45813OooO0O0;
                        if (j5Var5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            j5Var5 = null;
                        }
                        j5Var5.f58171OooO0o.f58596OooO0o0.setVisibility(0);
                        int i2 = (int) (d2 / ((double) 2000));
                        if (i2 == 0) {
                            j5 j5Var6 = this$0.f45813OooO0O0;
                            if (j5Var6 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                                j5Var6 = null;
                            }
                            ImageView imageView = j5Var6.f58171OooO0o.f58594OooO0Oo;
                            int i3 = oOo00OO0.icon_record_1;
                            imageView.setImageResource(i3);
                            j5 j5Var7 = this$0.f45813OooO0O0;
                            if (j5Var7 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            } else {
                                j5Var = j5Var7;
                            }
                            j5Var.f58171OooO0o.f58596OooO0o0.setImageResource(i3);
                            return;
                        }
                        if (i2 == 1) {
                            j5 j5Var8 = this$0.f45813OooO0O0;
                            if (j5Var8 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                                j5Var8 = null;
                            }
                            ImageView imageView2 = j5Var8.f58171OooO0o.f58594OooO0Oo;
                            int i4 = oOo00OO0.icon_record_2;
                            imageView2.setImageResource(i4);
                            j5 j5Var9 = this$0.f45813OooO0O0;
                            if (j5Var9 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            } else {
                                j5Var = j5Var9;
                            }
                            j5Var.f58171OooO0o.f58596OooO0o0.setImageResource(i4);
                            return;
                        }
                        if (i2 == 2) {
                            j5 j5Var10 = this$0.f45813OooO0O0;
                            if (j5Var10 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                                j5Var10 = null;
                            }
                            ImageView imageView3 = j5Var10.f58171OooO0o.f58594OooO0Oo;
                            int i5 = oOo00OO0.icon_record_3;
                            imageView3.setImageResource(i5);
                            j5 j5Var11 = this$0.f45813OooO0O0;
                            if (j5Var11 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            } else {
                                j5Var = j5Var11;
                            }
                            j5Var.f58171OooO0o.f58596OooO0o0.setImageResource(i5);
                            return;
                        }
                        if (i2 == 3) {
                            j5 j5Var12 = this$0.f45813OooO0O0;
                            if (j5Var12 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                                j5Var12 = null;
                            }
                            ImageView imageView4 = j5Var12.f58171OooO0o.f58594OooO0Oo;
                            int i6 = oOo00OO0.icon_record_4;
                            imageView4.setImageResource(i6);
                            j5 j5Var13 = this$0.f45813OooO0O0;
                            if (j5Var13 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            } else {
                                j5Var = j5Var13;
                            }
                            j5Var.f58171OooO0o.f58596OooO0o0.setImageResource(i6);
                            return;
                        }
                        if (i2 == 4) {
                            j5 j5Var14 = this$0.f45813OooO0O0;
                            if (j5Var14 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                                j5Var14 = null;
                            }
                            ImageView imageView5 = j5Var14.f58171OooO0o.f58594OooO0Oo;
                            int i7 = oOo00OO0.icon_record_5;
                            imageView5.setImageResource(i7);
                            j5 j5Var15 = this$0.f45813OooO0O0;
                            if (j5Var15 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            } else {
                                j5Var = j5Var15;
                            }
                            j5Var.f58171OooO0o.f58596OooO0o0.setImageResource(i7);
                            return;
                        }
                        if (i2 != 5) {
                            return;
                        }
                        j5 j5Var16 = this$0.f45813OooO0O0;
                        if (j5Var16 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            j5Var16 = null;
                        }
                        ImageView imageView6 = j5Var16.f58171OooO0o.f58596OooO0o0;
                        int i8 = oOo00OO0.icon_record_5;
                        imageView6.setImageResource(i8);
                        j5 j5Var17 = this$0.f45813OooO0O0;
                        if (j5Var17 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        } else {
                            j5Var = j5Var17;
                        }
                        j5Var.f58171OooO0o.f58594OooO0Oo.setImageResource(i8);
                    }
                });
            }
        }
    }
}
