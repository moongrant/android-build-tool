package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface ListBasedJavaAnnotationOwner extends JavaAnnotationOwner {

    public static final class DefaultImpls {
        @Nullable
        public static JavaAnnotation findAnnotation(@NotNull ListBasedJavaAnnotationOwner listBasedJavaAnnotationOwner, @NotNull FqName fqName) {
            Object obj;
            Object next;
            ClassId classId;
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            Iterator<T> it = listBasedJavaAnnotationOwner.getAnnotations().iterator();
            do {
                obj = null;
                if (it.hasNext()) {
                    next = it.next();
                    classId = ((JavaAnnotation) next).getClassId();
                }
                return (JavaAnnotation) obj;
            } while (!Intrinsics.areEqual(classId != null ? classId.asSingleFqName() : null, fqName));
            obj = next;
            return (JavaAnnotation) obj;
        }
    }
}
