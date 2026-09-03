package io.opencensus.tags;

/* JADX INFO: loaded from: classes5.dex */
public enum TagMetadata$TagTtl {
    NO_PROPAGATION(0),
    UNLIMITED_PROPAGATION(-1);

    private final int hops;

    TagMetadata$TagTtl(int i) {
        this.hops = i;
    }
}
