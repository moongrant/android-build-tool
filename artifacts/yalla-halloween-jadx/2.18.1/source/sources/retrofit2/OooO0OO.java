package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public interface OooO0OO<R, T> {

    public static abstract class OooO00o {
        @Nullable
        public abstract OooO0OO OooO00o(Type type, Annotation[] annotationArr);
    }

    T OooO00o(OooO0O0<R> oooO0O0);

    Type responseType();
}
