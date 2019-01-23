package cn.pomxl.springbootelastic.repository;

import cn.pomxl.springbootelastic.entry.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface BookRepository extends ElasticsearchRepository<Book,Integer> {
}
