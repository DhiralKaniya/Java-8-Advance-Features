package com.session.stream.custom;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.Collector;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class MyCustomStream<T> implements Stream<T> {

	private final Stream<T> instance;
	public MyCustomStream(Stream<T> instance){
		this.instance = instance;
	}
	@Override
	public void close() {
		
	}

	@Override
	public boolean isParallel() {
		return false;
	}

	@Override
	public Iterator<T> iterator() {
		return null;
	}

	@Override
	public Stream<T> onClose(Runnable arg0) {
		return null;
	}

	@Override
	public Stream<T> parallel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<T> sequential() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Spliterator<T> spliterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<T> unordered() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean allMatch(Predicate<? super T> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean anyMatch(Predicate<? super T> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <R, A> R collect(Collector<? super T, A, R> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <R> R collect(Supplier<R> arg0, BiConsumer<R, ? super T> arg1, BiConsumer<R, R> arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Stream<T> distinct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<T> filter(Predicate<? super T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<T> findAny() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<T> findFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DoubleStream flatMapToDouble(Function<? super T, ? extends DoubleStream> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IntStream flatMapToInt(Function<? super T, ? extends IntStream> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LongStream flatMapToLong(Function<? super T, ? extends LongStream> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void forEach(Consumer<? super T> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void forEachOrdered(Consumer<? super T> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Stream<T> limit(long arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <R> Stream<R> map(Function<? super T, ? extends R> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DoubleStream mapToDouble(ToDoubleFunction<? super T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IntStream mapToInt(ToIntFunction<? super T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LongStream mapToLong(ToLongFunction<? super T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<T> max(Comparator<? super T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<T> min(Comparator<? super T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean noneMatch(Predicate<? super T> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Stream<T> peek(Consumer<? super T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<T> reduce(BinaryOperator<T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T reduce(T arg0, BinaryOperator<T> arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <U> U reduce(U arg0, BiFunction<U, ? super T, U> arg1, BinaryOperator<U> arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<T> skip(long arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<T> sorted() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<T> sorted(Comparator<? super T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <A> A[] toArray(IntFunction<A[]> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
