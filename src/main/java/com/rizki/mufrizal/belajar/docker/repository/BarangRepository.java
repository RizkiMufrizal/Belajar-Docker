package com.rizki.mufrizal.belajar.docker.repository;

import com.rizki.mufrizal.belajar.docker.domain.Barang;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @Author Rizki Mufrizal <mufrizalrizki@gmail.com> <https://RizkiMufrizal.github.io>
 * @Since 16 July 2016
 * @Time 22:08
 * @Project Belajar-Docker
 * @Package com.rizki.mufrizal.belajar.docker.repository
 * @File BarangRepository
 */
@RepositoryRestResource(collectionResourceRel = "barang", path = "barang", collectionResourceDescription = @Description("API untuk crud data barang"))
public interface BarangRepository extends PagingAndSortingRepository<Barang, String> {
}
