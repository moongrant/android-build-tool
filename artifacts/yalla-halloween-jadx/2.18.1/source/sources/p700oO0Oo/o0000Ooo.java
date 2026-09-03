package p700oO0Oo;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.vm.message.PrivateChatVM;
import java.io.IOException;
import java.util.TimerTask;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import p649o0ooOOoo.cc;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000Ooo extends TimerTask {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0000 f52885Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ MotionEvent f52886Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ PrivateChatVM f52887Oooo0oo;

    public o0000Ooo(o0000 o0000Var, MotionEvent motionEvent, PrivateChatVM privateChatVM) {
        this.f52885Oooo0o = o0000Var;
        this.f52886Oooo0oO = motionEvent;
        this.f52887Oooo0oo = privateChatVM;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        o0000 o0000Var = this.f52885Oooo0o;
        o0000Var.f52862OooO = true;
        o0000Var.f52870OooO0oo = 0;
        o0000Var.f52865OooO0OO = this.f52885Oooo0o.f52867OooO0o + UUID.randomUUID() + ".aac";
        try {
            o0000 o0000Var2 = this.f52885Oooo0o;
            o0000Var2.f52869OooO0oO.OooO0o0(o0000Var2.f52865OooO0OO);
            this.f52885Oooo0o.f52869OooO0oO.start();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
        while (this.f52885Oooo0o.f52862OooO) {
            try {
                Thread.sleep(200L);
            } catch (InterruptedException e3) {
                e3.printStackTrace();
            }
            o0000 o0000Var3 = this.f52885Oooo0o;
            int i = o0000Var3.f52870OooO0oo + 200;
            o0000Var3.f52870OooO0oo = i;
            if (i >= 30000) {
                o0000Var3.f52863OooO00o.runOnUiThread(new o00000OO(o0000Var3, this.f52886Oooo0oO, this.f52887Oooo0oo));
            } else if (o0000Var3.f52862OooO) {
                if (i % 1000 == 0) {
                    o0000Var3.OooO0O0(i);
                }
                final o0000 o0000Var4 = this.f52885Oooo0o;
                final double d = o0000Var4.f52869OooO0oO.f40399OooOOO;
                o0000Var4.f52863OooO00o.runOnUiThread(new Runnable() { // from class: oO0Oo.o00000O0
                    @Override // java.lang.Runnable
                    public final void run() {
                        double d2 = d;
                        o0000 this$0 = o0000Var4;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        cc ccVar = null;
                        if (d2 == 0.0d) {
                            cc ccVar2 = this$0.f52864OooO0O0;
                            if (ccVar2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                                ccVar2 = null;
                            }
                            ccVar2.f49098OooO0oO.f49747OooO0Oo.setVisibility(4);
                            cc ccVar3 = this$0.f52864OooO0O0;
                            if (ccVar3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            } else {
                                ccVar = ccVar3;
                            }
                            ccVar.f49098OooO0oO.f49749OooO0o0.setVisibility(4);
                            return;
                        }
                        cc ccVar4 = this$0.f52864OooO0O0;
                        if (ccVar4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            ccVar4 = null;
                        }
                        ccVar4.f49098OooO0oO.f49747OooO0Oo.setVisibility(0);
                        cc ccVar5 = this$0.f52864OooO0O0;
                        if (ccVar5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            ccVar5 = null;
                        }
                        ccVar5.f49098OooO0oO.f49749OooO0o0.setVisibility(0);
                        int i2 = (int) (d2 / ((double) RecyclerView.MAX_SCROLL_DURATION));
                        if (i2 == 0) {
                            cc ccVar6 = this$0.f52864OooO0O0;
                            if (ccVar6 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                                ccVar6 = null;
                            }
                            ccVar6.f49098OooO0oO.f49747OooO0Oo.setImageResource(R.drawable.icon_record_1);
                            cc ccVar7 = this$0.f52864OooO0O0;
                            if (ccVar7 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            } else {
                                ccVar = ccVar7;
                            }
                            ccVar.f49098OooO0oO.f49749OooO0o0.setImageResource(R.drawable.icon_record_1);
                            return;
                        }
                        if (i2 == 1) {
                            cc ccVar8 = this$0.f52864OooO0O0;
                            if (ccVar8 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                                ccVar8 = null;
                            }
                            ccVar8.f49098OooO0oO.f49747OooO0Oo.setImageResource(R.drawable.icon_record_2);
                            cc ccVar9 = this$0.f52864OooO0O0;
                            if (ccVar9 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            } else {
                                ccVar = ccVar9;
                            }
                            ccVar.f49098OooO0oO.f49749OooO0o0.setImageResource(R.drawable.icon_record_2);
                            return;
                        }
                        if (i2 == 2) {
                            cc ccVar10 = this$0.f52864OooO0O0;
                            if (ccVar10 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                                ccVar10 = null;
                            }
                            ccVar10.f49098OooO0oO.f49747OooO0Oo.setImageResource(R.drawable.icon_record_3);
                            cc ccVar11 = this$0.f52864OooO0O0;
                            if (ccVar11 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            } else {
                                ccVar = ccVar11;
                            }
                            ccVar.f49098OooO0oO.f49749OooO0o0.setImageResource(R.drawable.icon_record_3);
                            return;
                        }
                        if (i2 == 3) {
                            cc ccVar12 = this$0.f52864OooO0O0;
                            if (ccVar12 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                                ccVar12 = null;
                            }
                            ccVar12.f49098OooO0oO.f49747OooO0Oo.setImageResource(R.drawable.icon_record_4);
                            cc ccVar13 = this$0.f52864OooO0O0;
                            if (ccVar13 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            } else {
                                ccVar = ccVar13;
                            }
                            ccVar.f49098OooO0oO.f49749OooO0o0.setImageResource(R.drawable.icon_record_4);
                            return;
                        }
                        if (i2 == 4) {
                            cc ccVar14 = this$0.f52864OooO0O0;
                            if (ccVar14 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                                ccVar14 = null;
                            }
                            ccVar14.f49098OooO0oO.f49747OooO0Oo.setImageResource(R.drawable.icon_record_5);
                            cc ccVar15 = this$0.f52864OooO0O0;
                            if (ccVar15 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            } else {
                                ccVar = ccVar15;
                            }
                            ccVar.f49098OooO0oO.f49749OooO0o0.setImageResource(R.drawable.icon_record_5);
                            return;
                        }
                        if (i2 != 5) {
                            return;
                        }
                        cc ccVar16 = this$0.f52864OooO0O0;
                        if (ccVar16 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            ccVar16 = null;
                        }
                        ccVar16.f49098OooO0oO.f49749OooO0o0.setImageResource(R.drawable.icon_record_5);
                        cc ccVar17 = this$0.f52864OooO0O0;
                        if (ccVar17 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        } else {
                            ccVar = ccVar17;
                        }
                        ccVar.f49098OooO0oO.f49747OooO0Oo.setImageResource(R.drawable.icon_record_5);
                    }
                });
            }
        }
    }
}
