mod hello_tdd_mod {
    pub fn hello(name: String) -> String {
        let mut s = String::from("Hello ");
        s.push_str(&name);
        return s;
    }
}

#[cfg(test)]
mod tests {
    use super::hello_tdd_mod;

    #[test]
    fn test_hello() -> Result<(), String> {
        let name = String::from("coder");
        assert_eq!(hello_tdd_mod::hello(name), String::from("Hello coder"));
        Ok(())
    }
}

fn main() {
    let a = hello_tdd_mod::hello(String::from("gurra"));
    println!("{}", a)
}
