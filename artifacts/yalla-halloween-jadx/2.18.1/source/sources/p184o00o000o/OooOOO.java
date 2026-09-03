package p184o00o000o;

import OooO00o.OooO00o;
import com.app.base.model.GiftAnimationModel;
import java.util.Objects;
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ GiftAnimationModel f33004Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ OooOOO0 f33005Oooo0oO;

    public OooOOO(OooOOO0 oooOOO0, GiftAnimationModel giftAnimationModel) {
        this.f33005Oooo0oO = oooOOO0;
        this.f33004Oooo0o = giftAnimationModel;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033 A[PHI: r0
      0x0033: PHI (r0v5 int) = (r0v1 int), (r0v14 int) binds: [B:6:0x000e, B:11:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.lang.Runnable
    public final void run() {
        int iRound = 1;
        while (true) {
            int i = this.f33004Oooo0o.giftNum;
            if (iRound > i) {
                this.f33005Oooo0oO.f33012OooO0oO.obtainMessage(101).sendToTarget();
                return;
            }
            Objects.requireNonNull(this.f33005Oooo0oO);
            if (i < 77) {
                i = iRound;
            } else {
                iRound += (int) (i == 77 ? Math.round((Math.random() * 2.0d) + 2.0d) : Math.round((Math.random() * 10.0d) + 10.0d));
                if (iRound < i - 1) {
                    i = iRound;
                }
            }
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("addGiftAnimationNum giftAnimationModel.getGiftNum = ");
            sbOooO0o0.append(this.f33004Oooo0o.giftNum);
            sbOooO0o0.append(", i = ");
            sbOooO0o0.append(i);
            o00O00.OooO0O0(sbOooO0o0.toString());
            OooOOO0 oooOOO0 = this.f33005Oooo0oO;
            if (!oooOOO0.f33013OooO0oo) {
                return;
            }
            oooOOO0.f33012OooO0oO.obtainMessage(100, Integer.valueOf(i)).sendToTarget();
            try {
                Thread.sleep(300L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            iRound = i + 1;
        }
    }
}
