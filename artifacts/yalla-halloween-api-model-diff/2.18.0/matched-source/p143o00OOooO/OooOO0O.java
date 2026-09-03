package p143o00OOooO;

import com.app.base.fragment.CoinDetailFragment;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOO0O implements Function1 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f31915Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static final /* synthetic */ OooOO0O f31914OoooO00 = new OooOO0O(0);

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public static final /* synthetic */ OooOO0O f31913OoooO0 = new OooOO0O(1);

    public /* synthetic */ OooOO0O(int i) {
        this.f31915Oooo = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f31915Oooo) {
            case 0:
                return CoinDetailFragment.lambda$getBillData$2((List) obj);
            default:
                return null;
        }
    }
}
