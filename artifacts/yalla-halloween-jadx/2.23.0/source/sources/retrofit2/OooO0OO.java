package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public interface OooO0OO<R, T> {

    public static abstract class OooO00o {
        @Nullable
        public abstract OooO0OO OooO00o(Type type, Annotation[] annotationArr);
    }

    Object OooO00o(o0Oo0oo o0oo0oo2);

    Type responseType();
}
