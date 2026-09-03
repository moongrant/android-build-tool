package p182o00o0000;

import androidx.lifecycle.LifecycleOwner;
import com.app.base.application.App;
import com.app.base.view.imageMore.ImageMoreItemView;
import com.yalla.yalla.util.netimage.listener.GifPlayControl;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0o extends GifPlayControl {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo f32960OooO0Oo;

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o0Oo0oo o0oo0oo2 = o0OOO0o.this.f32960OooO0Oo;
            if (o0oo0oo2.f32967OooO0o0) {
                return;
            }
            ArrayList<ItemView> arrayList = o0oo0oo2.f32964OooO0OO;
            if (arrayList != 0) {
                int size = arrayList.size();
                o0Oo0oo o0oo0oo3 = o0OOO0o.this.f32960OooO0Oo;
                int i = o0oo0oo3.f32963OooO0O0;
                if (size > i && i >= 0) {
                    Object obj = o0oo0oo3.f32965OooO0Oo;
                    if (obj != null) {
                        Object obj2 = o0oo0oo3.f32964OooO0OO.get(i);
                        Objects.requireNonNull((o0OO00O) obj);
                        ImageMoreItemView imageMoreItemView = (ImageMoreItemView) obj2;
                        imageMoreItemView.getData().setGifType(0);
                        imageMoreItemView.OooO0OO(true);
                    }
                    o0Oo0oo o0oo0oo4 = o0OOO0o.this.f32960OooO0Oo;
                    o0oo0oo4.f32964OooO0OO.remove(o0oo0oo4.f32963OooO0O0);
                    o0OOO0o.this.f32960OooO0Oo.f32963OooO0O0--;
                }
            }
            o0OOO0o.this.f32960OooO0Oo.OooO00o();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0o(o0Oo0oo o0oo0oo2, LifecycleOwner lifecycleOwner) {
        super(3, lifecycleOwner);
        this.f32960OooO0Oo = o0oo0oo2;
    }

    @Override // com.yalla.yalla.util.netimage.listener.GifPlayControl
    public final void OooO0OO() {
        o0Oo0oo o0oo0oo2 = this.f32960OooO0Oo;
        if (o0oo0oo2.f32967OooO0o0) {
            return;
        }
        Object obj = o0oo0oo2.f32965OooO0Oo;
        if (obj != null) {
            Object obj2 = o0oo0oo2.f32964OooO0OO.get(o0oo0oo2.f32963OooO0O0);
            o0Oo0oo o0oo0oo3 = this.f32960OooO0Oo;
            int i = o0oo0oo3.f32963OooO0O0;
            o0oo0oo3.f32964OooO0OO.size();
            Objects.requireNonNull((o0OO00O) obj);
            ImageMoreItemView imageMoreItemView = (ImageMoreItemView) obj2;
            if (imageMoreItemView != null) {
                imageMoreItemView.OooO0OO(true);
            }
        }
        this.f32960OooO0Oo.OooO00o();
    }

    @Override // com.yalla.yalla.util.netimage.listener.GifPlayControl
    public final void OooO0Oo() {
        App.f11459Oooo0oo.post(new OooO00o());
    }
}
