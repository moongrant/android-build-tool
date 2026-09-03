package p412o0Oo0oOo;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.yalla.yalla.data.manager.MicEmojiManager$loadUrlConfig$1;
import com.yalla.yalla.model.gift.GifListJson;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class s0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO00o f45256OooO00o = new OooO00o();

    public static final class OooO00o extends MutableLiveData<List<GifListJson>> {
        @Override // androidx.lifecycle.LiveData
        public final void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super List<GifListJson>> observer) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(observer, "observer");
            removeObservers(owner);
            super.observe(owner, observer);
            if (getValue() == null) {
                o000000O o000000o2 = o000000O.f46674OooO00o;
                if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                    OooO00o oooO00o = s0.f45256OooO00o;
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new MicEmojiManager$loadUrlConfig$1(null), 2, null);
                }
            }
        }
    }
}
