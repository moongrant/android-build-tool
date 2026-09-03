package org.mp4parser.aj.internal.lang.reflect;

import java.lang.annotation.Annotation;
import org.mp4parser.aj.lang.reflect.AjType;

/* JADX INFO: loaded from: classes5.dex */
public class AjTypeImpl<T> implements AjType<T> {
    public final boolean equals(Object obj) {
        if (!(obj instanceof AjTypeImpl)) {
            return false;
        }
        ((AjTypeImpl) obj).getClass();
        throw null;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final <A extends Annotation> A getAnnotation(Class<A> cls) {
        throw null;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getAnnotations() {
        throw null;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getDeclaredAnnotations() {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final boolean isAnnotationPresent(Class<? extends Annotation> cls) {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
